package com.ifohoo.firm25.ifms.middata.es.corp.core;

import cn.easyes.core.biz.PageInfo;
import cn.easyes.core.conditions.LambdaEsQueryWrapper;
import cn.hutool.extra.spring.SpringUtil;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.common.ifms.common.enums.ErrorCodeEnum;
import com.ifohoo.firm25.ifms.middata.common.dto.core.MidDataOperation;
import com.ifohoo.firm25.ifms.middata.common.dto.corp.CorpBasicDto;
import com.ifohoo.firm25.ifms.middata.es.corp.domain.CorpBasic;
import com.ifohoo.firm25.ifms.middata.es.corp.mapper.EsCorpBasicMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: hj
 * @date: 2023/2/14
 * @time: 5:44 PM
 */
@Component("corpBasicOperation")
public class CorpBasicOperation implements MidDataOperation<CorpBasicDto, CorpBasic> {

    @Autowired
    private EsCorpBasicMapper esCorpBasicMapper;


    @Override
    public boolean add(CorpBasicDto corpBasicDto) {
        CorpBasic corpBasic = new CorpBasic();
        BeanUtils.copyProperties(corpBasicDto, corpBasic);
        return esCorpBasicMapper.insert(corpBasic) > 0;
    }

    @Override
    public boolean addAll(List<CorpBasicDto> t) {
        List<CorpBasic> corpBasics = t.stream().map(corpBasicDto -> {
            CorpBasic corpBasic = new CorpBasic();
            BeanUtils.copyProperties(corpBasicDto, corpBasic);
            return corpBasic;
        }).collect(Collectors.toList());
        return esCorpBasicMapper.insertBatch(corpBasics) > 0;
    }

    @Override
    public boolean update(CorpBasicDto corpBasicDto) {
        CorpBasic corpBasic = new CorpBasic();
        BeanUtils.copyProperties(corpBasicDto, corpBasic);
        return esCorpBasicMapper.updateById(corpBasic) > 0;
    }

    @Override
    public boolean delete(CorpBasicDto corpBasicDto) {
        return false;
    }

    @Override
    public List<CorpBasic> query(CorpBasicDto corpBasicDto) {
        return null;
    }

    @Override
    public List<CorpBasic> queryPage(CorpBasicDto corpBasicDto, int pageNum, int pageSize) {
        return null;
    }
}
