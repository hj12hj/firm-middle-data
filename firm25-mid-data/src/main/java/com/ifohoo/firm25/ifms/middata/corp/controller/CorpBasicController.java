package com.ifohoo.firm25.ifms.middata.corp.controller;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.common.ifms.common.enums.ErrorCodeEnum;
import com.ifohoo.firm25.ifms.middata.corp.domain.CorpBasic;
import com.ifohoo.firm25.ifms.middata.corp.service.CorpBasicService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: hj
 * @date: 2023/2/12
 * @time: 12:37 PM
 */
@RestController
public class CorpBasicController {


    @Autowired
    CorpBasicService corpBasicService;

    /**
     * 数据库查询   企业基本信息map
     *
     * @param page
     * @param pagesize
     * @return
     */
    @GetMapping("/corpBasic/map")
    public ReturnMessage list(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "pagesize", defaultValue = "10") Integer pagesize, CorpBasic corpBasic, HttpServletRequest request) {
        //  获取请求头中的数据源
        String db = request.getHeader("db");
        //  动态切数据源
        if (StringUtils.isNotBlank(db)) {
            DynamicDataSourceContextHolder.push(db);
        }
        return corpBasicService.findCorpBasicMap(page, pagesize, corpBasic);
    }

    @GetMapping("/corpBasic/Esmap")
    public ReturnMessage listEs(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                @RequestParam(value = "pagesize", defaultValue = "10") Integer pagesize, CorpBasic corpBasic) {

        return corpBasicService.findCorpBasicEsMap(page, pagesize, corpBasic);
    }

}
