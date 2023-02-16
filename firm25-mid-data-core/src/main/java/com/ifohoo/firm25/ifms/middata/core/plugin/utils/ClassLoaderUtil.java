package com.ifohoo.firm25.ifms.middata.core.plugin.utils;

import org.slf4j.Logger;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

/**
 * 自定义类加载器
 *
 * @author: hj
 * @date: 2023/2/16
 * @time: 9:29 AM
 */
public class ClassLoaderUtil {

    private final static Logger log = org.slf4j.LoggerFactory.getLogger(ClassLoaderUtil.class);

    public static ClassLoader addPathAndGetClassLoader(String url) {
        try {
            Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            // 用于加载插件的类加载器 打包成jar必须用这个
            URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
            method.invoke(classLoader, new URL(url));
            return classLoader;
        } catch (Exception e) {
            log.error("getClassLoader-error", e);
            return null;
        }
    }


    public static ClassLoader addPathsAndGetClassLoader(List<String> urls) {
        try {
            Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            // 用于加载插件的类加载器 打包成jar必须用这个
            URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
            for (String url : urls) {
                method.invoke(classLoader, new URL(url));
            }
            return classLoader;
        } catch (Exception e) {
            log.error("getClassLoader-error", e);
            return null;
        }
    }

}
