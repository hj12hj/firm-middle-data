package com.ifohoo.firm25.ifms.middata.core.secu.controller;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.firm25.ifms.middata.core.secu.domain.SecuBasic;
import com.ifohoo.firm25.ifms.middata.core.secu.service.SecuBasicService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: hj
 * @date: 2023/2/14
 * @time: 9:57 AM
 */
@RestController
public class SecuBasicController {

    @Autowired
    SecuBasicService secuBasicService;


    @GetMapping("/secuBasic/map")
    public ReturnMessage secuBasicMap(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                      @RequestParam(value = "pagesize", defaultValue = "10") Integer pagesize,
                                      SecuBasic secuBasic, HttpServletRequest request) {
        //  获取请求头中的数据源
        String db = request.getHeader("db");
        //  动态切数据源
        if (StringUtils.isNotBlank(db)) {
            DynamicDataSourceContextHolder.push(db);
        }
        return secuBasicService.findSecuBasicMap(page, pagesize, secuBasic);
    }

    @GetMapping("/secuBasic/esMap")
    public ReturnMessage secuBasicEsMap(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                        @RequestParam(value = "pagesize", defaultValue = "10") Integer pagesize,
                                        SecuBasic secuBasic) {

        return secuBasicService.findSecuBasicEsMap(page, pagesize, secuBasic);
    }

}
