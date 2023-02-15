package com.ifohoo.firm25.ifms.middata.es.config;

import cn.easyes.starter.register.EsMapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: hj
 * @date: 2023/2/15
 * @time: 9:19 AM
 */
@Configuration
@EsMapperScan("com.ifohoo.firm25.ifms.middata.es.**.mapper")
@ComponentScan("com.ifohoo.firm25.ifms.middata.es")
public class MiddleDataEsConfig {
}
