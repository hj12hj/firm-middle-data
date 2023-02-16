package com.ifohoo.firm25.ifms.middata.core.plugin.registrar;


import com.ifohoo.firm25.ifms.middata.core.plugin.utils.ClassLoaderUtil;
import org.slf4j.Logger;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * @author: hj
 * @date: 2023/2/15
 * @time: 3:07 PM
 */
public class PluginImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar, EnvironmentAware {


    public static void main(String[] args) throws IOException {

        String path = "jar:file:/Users/hejie/Desktop/firm-middle-data/firm25-mid-data-es/target/firm25-mid-data-es-7.14.0.jar!/plugin.properties";
        URL url = new URL(path);
        InputStream resourceAsStream = url.openStream();
        InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream);
        Properties properties = new Properties();
        properties.load(inputStreamReader);
        String pluginClass = properties.getProperty("pluginClass");
    }

    Logger log = org.slf4j.LoggerFactory.getLogger(PluginImportBeanDefinitionRegistrar.class);

    /**
     * jar的地址
     */
    private String targetUrl;

    /**
     * 注册jar 包 默认路径为当前项目下的plugin目录
     *
     * @param importingClassMetadata annotation metadata of the importing class
     * @param registry               current bean definition registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        String path = "";
        if (targetUrl != null) {
            path = targetUrl;
            registerBeanFromJar(registry, path);
        } else {
            path = System.getProperty("user.dir") + "/plugin";
            File file = new File(path);
            if (file.exists()) {
                File[] files = file.listFiles();
                if (files.length > 0) {
                    Arrays.stream(files).forEach(f -> {
                        if (f.getName().endsWith(".jar")) {
                            log.info("动态加载 jar 包 [{}]", f.getAbsolutePath());
                            registerBeanFromJar(registry, f.getAbsolutePath());
                        }
                    });
                }
            }
        }
    }

    /**
     * 从jar包中注册bean
     *
     * @param registry
     * @param path
     */
    private void registerBeanFromJar(BeanDefinitionRegistry registry, String path) {
        ClassLoader classLoader = ClassLoaderUtil.addPathAndGetClassLoader("file:" + path);
        try {
            getLoadedClass(path).forEach(pluginClass -> {
                Class<?> clazz = null;
                try {
                    clazz = classLoader.loadClass(pluginClass);
                    BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(clazz);
                    BeanDefinition beanDefinition = builder.getBeanDefinition();
                    registry.registerBeanDefinition(clazz.getName(), beanDefinition);
                    log.info("register bean [{}],Class [{}] success.", clazz.getName(), clazz);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.targetUrl = environment.getProperty("targetUrl");
    }


    private List<String> getLoadedClass(String jarPath) throws IOException {
        String path = "jar:file:" + jarPath + "!/plugin.properties";
        URL url = new URL(path);
        InputStream resourceAsStream = url.openStream();
        InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream);
        Properties properties = new Properties();
        properties.load(inputStreamReader);
        String pluginClass = properties.getProperty("pluginClass");
        return Arrays.asList(pluginClass.split(","));
    }


}
