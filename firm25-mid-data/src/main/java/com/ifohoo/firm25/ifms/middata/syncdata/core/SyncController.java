package com.ifohoo.firm25.ifms.middata.syncdata.core;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.ds.ItemDataSource;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.common.ifms.common.enums.ErrorCodeEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 同步数据Controller
 *
 * @author: hj
 * @date: 2023/2/13
 * @time: 11:04 AM
 */
@RestController
public class SyncController {

    @Resource
    private Map<String, SyncData> syncDataMap;

    /**
     * 加锁同步数据
     *
     * @param type
     * @return
     */
    @PutMapping("/syncData/{type}")
    public ReturnMessage syncData(@PathVariable String type, HttpServletRequest request) {
        //  获取请求头中的数据源
        String db = request.getHeader("db");
        //修改数据源
        if (StringUtils.isNotBlank(db)) {
            DynamicDataSourceContextHolder.push(db);
        }
        SyncData syncData = syncDataMap.get(type);
        if (syncData == null) {
            throw new RuntimeException("同步数据类型不存在");
        }
        return syncData.doSyncData();
    }

    @Autowired
    DynamicRoutingDataSource dynamicRoutingDataSource;


    /**
     * 获取数据源列表
     *
     * @return
     */
    @GetMapping("/db/list")
    public ReturnMessage listDb() {
        ReturnMessage returnMessage = new ReturnMessage();
        Map<String, DataSource> dataSources = dynamicRoutingDataSource.getDataSources();
        Map<String, DataSourceInfo> dataSourceInfoMap = new HashMap<>();
        dynamicRoutingDataSource.getDataSources().forEach((k, v) -> {
            DruidDataSource druidDataSource = (DruidDataSource) ((ItemDataSource) v).getDataSource();
            DataSourceInfo dataSourceInfo = new DataSourceInfo();
            dataSourceInfo.setUrl(druidDataSource.getUrl());
            dataSourceInfo.setUsername(druidDataSource.getUsername());
            dataSourceInfo.setPassword(druidDataSource.getPassword());
            dataSourceInfo.setDriverClassName(druidDataSource.getDriverClassName());
            dataSourceInfoMap.put(k, dataSourceInfo);
        });
        returnMessage.setReturnData(dataSourceInfoMap);
        returnMessage.modifyMsg(ErrorCodeEnum.NORMAL);
        return returnMessage;
    }

    /**
     * 数据源信息
     */
    static class DataSourceInfo {
        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getDriverClassName() {
            return driverClassName;
        }

        public void setDriverClassName(String driverClassName) {
            this.driverClassName = driverClassName;
        }

        String url;
        String username;
        String password;
        String driverClassName;
    }

}
