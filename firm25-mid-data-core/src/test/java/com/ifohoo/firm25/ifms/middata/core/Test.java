package com.ifohoo.firm25.ifms.middata.core;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;


@SpringBootTest
class Test {

    @Autowired
    StringRedisTemplate redisSerTemplate;


    @org.junit.jupiter.api.Test
    void name() {
        redisSerTemplate.opsForList().leftPush("corpBasic", "s1");

    }
}
