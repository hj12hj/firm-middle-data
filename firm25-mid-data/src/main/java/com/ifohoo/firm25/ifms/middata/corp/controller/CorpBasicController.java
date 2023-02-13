package com.ifohoo.firm25.ifms.middata.corp.controller;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.common.ifms.common.enums.ErrorCodeEnum;
import com.ifohoo.firm25.ifms.middata.corp.service.CorpBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/corpBasic/list")
    public ReturnMessage list(HttpServletRequest request) {

        String db = request.getHeader("db");

        DynamicDataSourceContextHolder.push(db);

        ReturnMessage returnMessage = new ReturnMessage();
        returnMessage.modifyMsg(ErrorCodeEnum.NORMAL);
        returnMessage.setReturnData(corpBasicService.page(new Page<>(1, 10), null).getRecords());
        return returnMessage;
    }


}
