package com.ifohoo.firm25.ifms.middata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: hj
 * @date: 2023/2/11
 * @time: 1:57 下午
 */
@SpringBootApplication
@ComponentScan({
        "com.ifohoo.firm25.ifms.middata",
        "cn.hutool.extra.spring",
        "com.ifohoo.common.ifms.redis",
        "com.ifohoo.common.ifms.token",
        "com.ifohoo.common.ifms.common",
        "com.ifohoo.common.ifms.baseinfo"
})
public class IfmsMidDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(IfmsMidDataApplication.class, args);
    }
}
