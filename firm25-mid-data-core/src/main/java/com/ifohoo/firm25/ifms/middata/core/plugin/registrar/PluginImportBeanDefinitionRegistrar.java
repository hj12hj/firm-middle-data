package com.ifohoo.firm25.ifms.middata.core.plugin.registrar;


import com.ifohoo.firm25.ifms.middata.core.plugin.utils.ClassLoaderUtil;
import org.slf4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * @author: hj
 * @date: 2023/2/15
 * @time: 3:07 PM
 */
public class PluginImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar, EnvironmentAware {

    Logger log = org.slf4j.LoggerFactory.getLogger(PluginImportBeanDefinitionRegistrar.class);

    /**
     * jar的地址
     */
    private String targetUrl;

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        ClassLoader classLoader = ClassLoaderUtil.getClassLoader(targetUrl);
        try {
            getLoadedClass(classLoader).forEach(pluginClass -> {
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


    private List<String> getLoadedClass(ClassLoader classLoader) throws IOException {
        InputStream resourceAsStream = classLoader.getResourceAsStream("plugin.properties");
        InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream);
        Properties properties = new Properties();
        properties.load(inputStreamReader);
        String pluginClass = properties.getProperty("pluginClass");
        return Arrays.asList(pluginClass.split(","));
    }


}
