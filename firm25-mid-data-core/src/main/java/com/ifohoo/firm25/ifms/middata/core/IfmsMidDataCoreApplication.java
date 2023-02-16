package com.ifohoo.firm25.ifms.middata.core;

import com.ifohoo.firm25.ifms.middata.core.plugin.registrar.PluginImportBeanDefinitionRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author: hj
 * @date: 2023/2/11
 * @time: 1:57 下午
 */
@SpringBootApplication
@ComponentScan({
        "com.ifohoo.firm25.ifms.middata.core",
        "cn.hutool.extra.spring",
        "com.ifohoo.common.ifms.redis",
        "com.ifohoo.common.ifms.token",
        "com.ifohoo.common.ifms.common",
        "com.ifohoo.common.ifms.baseinfo",
})
@Import(PluginImportBeanDefinitionRegistrar.class)
public class IfmsMidDataCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(IfmsMidDataCoreApplication.class, args);
    }
}
