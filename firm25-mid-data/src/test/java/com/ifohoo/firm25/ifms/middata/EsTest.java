package com.ifohoo.firm25.ifms.middata;


import cn.easyes.core.biz.PageInfo;
import cn.easyes.core.conditions.LambdaEsQueryWrapper;
import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.provider.YmlDynamicDataSourceProvider;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ifohoo.firm25.ifms.middata.corp.domain.CorpBasic;
import com.ifohoo.firm25.ifms.middata.corp.esmapper.EsCorpBasicMapper;
import com.ifohoo.firm25.ifms.middata.corp.service.CorpBasicService;
import com.ifohoo.firm25.ifms.middata.corp.sqlmapper.CorpBasicMapper;
import com.ifohoo.firm25.ifms.middata.syncdata.core.SyncData;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;


@SpringBootTest
class EsTest {


    @Autowired
    CorpBasicService corpBasicService;

    @Test
    void name() {
        DynamicDataSourceContextHolder.push("db1");
        QueryWrapper<CorpBasic> wrapper = new QueryWrapper<>();
        wrapper.eq("corp_code", "91320602MA1MEPR136");
        Page<CorpBasic> corpBasicPage = corpBasicService.page(new Page<>(1, 10), wrapper);
        System.out.println(corpBasicPage.toString());

    }


    @Autowired
    EsCorpBasicMapper esCorpBasicMapper;

    @Test
    void es() {
        LambdaEsQueryWrapper<CorpBasic> queryWrapper = new LambdaEsQueryWrapper<>();
        queryWrapper.match(CorpBasic::getCorpFullname, "北京");
        PageInfo<CorpBasic> corpBasicPageInfo = esCorpBasicMapper.pageQuery(queryWrapper, 1, 10);
        System.out.println(corpBasicPageInfo.toString());
    }


    @Autowired
    SyncData syncData;

    @Autowired
    RestHighLevelClient restHighLevelClient;

    @Autowired
    CorpBasicMapper corpBasicMapper;

    @Autowired
    DynamicRoutingDataSource dynamicRoutingDataSource;

    @Test
    void syncData() {

        IPage<CorpBasic> allPage = corpBasicMapper.findAllPage(new Page<>(1, 10));
        List<CorpBasic> records = allPage.getRecords();
        System.out.println(records);

    }
}
