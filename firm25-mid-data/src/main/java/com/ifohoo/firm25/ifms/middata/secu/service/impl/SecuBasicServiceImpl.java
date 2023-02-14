package com.ifohoo.firm25.ifms.middata.secu.service.impl;

import cn.easyes.core.biz.PageInfo;
import cn.easyes.core.conditions.LambdaEsQueryWrapper;
import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.common.ifms.common.enums.ErrorCodeEnum;
import com.ifohoo.firm25.ifms.middata.corp.domain.CorpBasic;
import com.ifohoo.firm25.ifms.middata.secu.domain.SecuBasic;
import com.ifohoo.firm25.ifms.middata.secu.esmapper.EsSecuBasicMapper;
import com.ifohoo.firm25.ifms.middata.secu.sqlmapper.SecuBasicMapper;
import com.ifohoo.firm25.ifms.middata.secu.service.SecuBasicService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author hejie
 * @description 针对表【SECU_BASIC(证券基本信息表)】的数据库操作Service实现
 * @createDate 2023-02-10 23:25:56
 */
@Service
public class SecuBasicServiceImpl extends ServiceImpl<SecuBasicMapper, SecuBasic>
        implements SecuBasicService {


    @Override
    public ReturnMessage findSecuBasicMap(int page, int pagesize, SecuBasic secuBasic) {
        ReturnMessage returnMessage = new ReturnMessage();
        QueryWrapper<SecuBasic> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(secuBasic.getSecuName())) {
            queryWrapper.like("secu_name", secuBasic.getSecuName());
        }
        Page<SecuBasic> secuBasicPage = this.page(new Page<>(page, pagesize), queryWrapper);
        Map<String, String> secuBasicMap = new HashMap<>();
        secuBasicPage.getRecords().forEach(item -> {
            secuBasicMap.put(item.getSecuCode(), item.getSecuName());
        });
        returnMessage.setReturnData(secuBasicMap);
        returnMessage.modifyMsg(ErrorCodeEnum.NORMAL);
        return returnMessage;
    }

    @Override
    public ReturnMessage findSecuBasicEsMap(Integer page, Integer pagesize, SecuBasic secuBasic) {
        ReturnMessage returnMessage = new ReturnMessage();
        LambdaEsQueryWrapper<SecuBasic> queryWrapper = new LambdaEsQueryWrapper<>();
        if (StringUtils.isNotBlank(secuBasic.getSecuName())) {
            queryWrapper.match(SecuBasic::getSecuName, secuBasic.getSecuName());
        }
        PageInfo<SecuBasic> secuBasicPageInfo = SpringUtil.getBean(EsSecuBasicMapper.class).pageQuery(queryWrapper, page, pagesize);
        List<SecuBasic> records = secuBasicPageInfo.getList();
        returnMessage.setReturnData(records.stream().collect(Collectors.toMap(SecuBasic::getSecuCode, SecuBasic::getSecuName)));
        returnMessage.modifyMsg(ErrorCodeEnum.NORMAL);
        return returnMessage;
    }
}




