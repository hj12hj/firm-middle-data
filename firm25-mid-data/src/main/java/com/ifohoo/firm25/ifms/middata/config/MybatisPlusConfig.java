package com.ifohoo.firm25.ifms.middata.config;

import cn.easyes.starter.register.EsMapperScan;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: hj
 * @date: 2023/2/12
 * @time: 12:21 PM
 */
@Configuration
@MapperScan("com.ifohoo.firm25.ifms.middata.**.mapper")
@EsMapperScan("com.ifohoo.firm25.ifms.middata.**.esmapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     *
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.ORACLE));
        return interceptor;
    }


}
