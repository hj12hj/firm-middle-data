package com.ifohoo.firm25.ifms.middata.corp.service.impl;

import cn.easyes.core.biz.PageInfo;
import cn.easyes.core.conditions.LambdaEsQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.common.ifms.common.enums.ErrorCodeEnum;
import com.ifohoo.firm25.ifms.middata.corp.domain.CorpBasic;
import com.ifohoo.firm25.ifms.middata.corp.esmapper.EsCorpBasicMapper;
import com.ifohoo.firm25.ifms.middata.corp.sqlmapper.CorpBasicMapper;
import com.ifohoo.firm25.ifms.middata.corp.service.CorpBasicService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author hejie
 * @description 针对表【CORP_BASIC(企业基本信息表)】的数据库操作Service实现
 * @createDate 2023-02-10 23:21:53
 */
@Service
public class CorpBasicServiceImpl extends ServiceImpl<CorpBasicMapper, CorpBasic>
        implements CorpBasicService {

    @Autowired
    CorpBasicMapper corpBasicMapper;

    /**
     * 数据库查询
     *
     * @param page
     * @param pagesize
     * @param corpBasic
     * @return
     */
    @Override
    public ReturnMessage findCorpBasicMap(int page, int pagesize, CorpBasic corpBasic) {
        ReturnMessage returnMessage = new ReturnMessage();
        QueryWrapper<CorpBasic> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(corpBasic.getCorpName())) {
            queryWrapper.like("corp_name", "%" + corpBasic.getCorpName() + "%");
        }
        List<CorpBasic> records = this.page(new Page<>(page, pagesize), queryWrapper).getRecords();
        returnMessage.setReturnData(records.stream().collect(Collectors.toMap(CorpBasic::getCorpCode, CorpBasic::getCorpName)));
        returnMessage.modifyMsg(ErrorCodeEnum.NORMAL);
        return returnMessage;
    }


    @Autowired
    EsCorpBasicMapper esCorpBasicMapper;

    /**
     * es查询
     *
     * @param page
     * @param pagesize
     * @param corpBasic
     * @return
     */
    @Override
    public ReturnMessage findCorpBasicEsMap(int page, int pagesize, CorpBasic corpBasic) {
        ReturnMessage returnMessage = new ReturnMessage();
        LambdaEsQueryWrapper<CorpBasic> queryWrapper = new LambdaEsQueryWrapper<>();
        if (StringUtils.isNotBlank(corpBasic.getCorpName())) {
            queryWrapper.match(CorpBasic::getCorpName, corpBasic.getCorpName());
        }
        PageInfo<CorpBasic> corpBasicPageInfo = esCorpBasicMapper.pageQuery(queryWrapper, page, pagesize);
        List<CorpBasic> records = corpBasicPageInfo.getList();
        returnMessage.setReturnData(records.stream().collect(Collectors.toMap(CorpBasic::getCorpCode, CorpBasic::getCorpName)));
        returnMessage.modifyMsg(ErrorCodeEnum.NORMAL);
        return returnMessage;
    }
}




