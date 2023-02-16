package com.ifohoo.firm25.ifms.middata.es.config;

import cn.easyes.common.enums.ProcessIndexStrategyEnum;
import cn.easyes.common.utils.ExceptionUtils;
import cn.easyes.common.utils.RestHighLevelClientBuilder;
import cn.easyes.common.utils.StringUtils;
import cn.easyes.core.config.GlobalConfig;
import cn.easyes.starter.config.EasyEsConfigProperties;
import cn.easyes.starter.factory.IndexStrategyFactory;
import cn.easyes.starter.register.EsMapperScan;
import com.ifohoo.firm25.ifms.middata.es.corp.core.EsCorpBasicOperation;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

import static cn.easyes.common.constants.BaseEsConstants.COLON;
import static cn.easyes.common.constants.BaseEsConstants.DEFAULT_SCHEMA;

/**
 * @author: hj
 * @date: 2023/2/15
 * @time: 9:19 AM
 */
@Configuration
@EsMapperScan("com.ifohoo.firm25.ifms.middata.es.**.mapper")
@ComponentScan(basePackages = {"com.ifohoo.firm25.ifms.middata.es","cn.easyes.starter.service"} )
public class MiddleDataEsConfig {

    @Value("${easy-es.address}")
    private String address;

    @Value("${easy-es.username}")
    private String username;

    @Value("${easy-es.password}")
    private String password;

    @Value("${easy-es.connection-request-timeout}")
    private Integer connectionRequestTimeout;

    @Bean
    EasyEsConfigProperties easyEsConfigProperties() {
        EasyEsConfigProperties easyEsConfigProperties = new EasyEsConfigProperties();
        easyEsConfigProperties.setAddress(address);
        easyEsConfigProperties.setUsername(username);
        easyEsConfigProperties.setPassword(password);
        easyEsConfigProperties.setConnectionRequestTimeout(connectionRequestTimeout);
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setProcessIndexMode(ProcessIndexStrategyEnum.MANUAL);
        easyEsConfigProperties.setGlobalConfig(globalConfig);
        return easyEsConfigProperties;
    }
    @Bean
    IndexStrategyFactory indexStrategyFactory() {
        return new IndexStrategyFactory();
    }



    /**
     * 装配RestHighLevelClient
     *
     * @return RestHighLevelClient bean
     */
    @Bean
    public RestHighLevelClient restHighLevelClient() {
        // 处理地址
        String address = easyEsConfigProperties().getAddress();
        if (StringUtils.isEmpty(address)) {
            throw ExceptionUtils.eee("please config the es address");
        }
        if (!address.contains(COLON)) {
            throw ExceptionUtils.eee("the address must contains port and separate by ':'");
        }
        String schema = StringUtils.isEmpty(easyEsConfigProperties().getSchema())
                ? DEFAULT_SCHEMA : easyEsConfigProperties().getSchema();
        List<HttpHost> hostList = new ArrayList<>();
        Arrays.stream(easyEsConfigProperties().getAddress().split(","))
                .forEach(item -> hostList.add(new HttpHost(item.split(":")[0],
                        Integer.parseInt(item.split(":")[1]), schema)));

        // 转换成 HttpHost 数组
        HttpHost[] httpHost = hostList.toArray(new HttpHost[]{});
        // 构建连接对象
        RestClientBuilder builder = RestClient.builder(httpHost);

        // 设置账号密码最大连接数之类的
        String username = easyEsConfigProperties().getUsername();
        String password = easyEsConfigProperties().getPassword();
        Integer maxConnTotal = easyEsConfigProperties().getMaxConnTotal();
        Integer maxConnPerRoute = easyEsConfigProperties().getMaxConnPerRoute();
        Integer keepAliveMillis = easyEsConfigProperties().getKeepAliveMillis();
        boolean needSetHttpClient = (StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(password))
                || (Objects.nonNull(maxConnTotal) || Objects.nonNull(maxConnPerRoute)) || Objects.nonNull(keepAliveMillis);
        if (needSetHttpClient) {
            builder.setHttpClientConfigCallback(httpClientBuilder -> {
                // 设置心跳时间等
                Optional.ofNullable(keepAliveMillis).ifPresent(p -> httpClientBuilder.setKeepAliveStrategy((response, context) -> p));
                Optional.ofNullable(maxConnTotal).ifPresent(httpClientBuilder::setMaxConnTotal);
                Optional.ofNullable(maxConnPerRoute).ifPresent(httpClientBuilder::setMaxConnPerRoute);
                if (StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(password)) {
                    final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
                    // 设置账号密码
                    credentialsProvider.setCredentials(AuthScope.ANY,
                            new UsernamePasswordCredentials(easyEsConfigProperties().getUsername(), easyEsConfigProperties().getPassword()));
                    httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
                }
                return httpClientBuilder;
            });
        }

        // 设置超时时间之类的
        Integer connectTimeOut = easyEsConfigProperties().getConnectTimeout();
        Integer socketTimeOut = easyEsConfigProperties().getSocketTimeout();
        Integer connectionRequestTimeOut = easyEsConfigProperties().getConnectionRequestTimeout();
        boolean needSetRequestConfig = Objects.nonNull(connectTimeOut) || Objects.nonNull(connectionRequestTimeOut);
        if (needSetRequestConfig) {
            builder.setRequestConfigCallback(requestConfigBuilder -> {
                Optional.ofNullable(connectTimeOut).ifPresent(requestConfigBuilder::setConnectTimeout);
                Optional.ofNullable(socketTimeOut).ifPresent(requestConfigBuilder::setSocketTimeout);
                Optional.ofNullable(connectionRequestTimeOut)
                        .ifPresent(requestConfigBuilder::setConnectionRequestTimeout);
                return requestConfigBuilder;
            });
        }

        return RestHighLevelClientBuilder.build(builder);
    }

}
