package com.ifohoo.firm25.ifms.middata.es.corp.core;

import cn.easyes.core.biz.PageInfo;
import cn.easyes.core.conditions.LambdaEsQueryWrapper;
import com.ifohoo.common.ifms.dto.PageDto;
import com.ifohoo.firm25.ifms.middata.common.dto.core.MidDataOperation;
import com.ifohoo.firm25.ifms.middata.common.dto.corp.CorpBasicDto;
import com.ifohoo.firm25.ifms.middata.es.corp.domain.CorpBasic;
import com.ifohoo.firm25.ifms.middata.es.corp.mapper.EsCorpBasicMapper;
import com.ifohoo.firm25.ifms.middata.es.opetation.EsTemplate;
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
@Component("esCorpBasicOperation")
public class EsCorpBasicOperation implements MidDataOperation<CorpBasicDto> {

    @Autowired(required = false)
    private EsCorpBasicMapper esCorpBasicMapper;

    @Autowired(required = false)
    private EsTemplate esTemplate;

    @Override
    public void init() {
        try {
            esCorpBasicMapper.deleteIndex("corp_basic");
            esCorpBasicMapper.createIndex();
            esTemplate.setMaxResultWindow("corp_basic", 6000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
    public List<CorpBasicDto> query(CorpBasicDto corpBasicDto) {
        CorpBasic corpBasic = new CorpBasic();
        BeanUtils.copyProperties(corpBasicDto, corpBasic);
        LambdaEsQueryWrapper<CorpBasic> lambdaEsQueryWrapper = new LambdaEsQueryWrapper<>();
        if (StringUtils.isNotBlank(corpBasic.getCorpName())) {
            lambdaEsQueryWrapper.match(CorpBasic::getCorpName, corpBasic.getCorpName());
        }
        if (StringUtils.isNotBlank(corpBasic.getCorpCode())) {
            lambdaEsQueryWrapper.eq(CorpBasic::getCorpCode, corpBasic.getCorpCode());
        }
        List<CorpBasic> corpBasicList = esCorpBasicMapper.selectList(lambdaEsQueryWrapper);

        return corpBasicList.stream().map(corpBasic1 -> {
            CorpBasicDto corpBasicDto1 = new CorpBasicDto();
            BeanUtils.copyProperties(corpBasic1, corpBasicDto1);
            return corpBasicDto1;
        }).collect(Collectors.toList());
    }

    @Override
    public PageDto<CorpBasicDto> queryPage(CorpBasicDto corpBasicDto, int pageNum, int pageSize) {
        CorpBasic corpBasic = new CorpBasic();
        BeanUtils.copyProperties(corpBasicDto, corpBasic);
        LambdaEsQueryWrapper<CorpBasic> lambdaEsQueryWrapper = new LambdaEsQueryWrapper<>();
        if (StringUtils.isNotBlank(corpBasic.getCorpName())) {
            lambdaEsQueryWrapper.match(CorpBasic::getCorpName, corpBasic.getCorpName());
        }
        if (StringUtils.isNotBlank(corpBasic.getCorpCode())) {
            lambdaEsQueryWrapper.eq(CorpBasic::getCorpCode, corpBasic.getCorpCode());
        }
        PageInfo<CorpBasic> corpBasicPageInfo = esCorpBasicMapper.pageQuery(lambdaEsQueryWrapper, pageNum, pageSize);
        List<CorpBasic> corpBasics = corpBasicPageInfo.getList();
        long total = corpBasicPageInfo.getTotal();
        PageDto<CorpBasicDto> pageDto = new PageDto<>();
        pageDto.setTotal(total);
        pageDto.setList(corpBasics.stream().map(corpBasic1 -> {
            CorpBasicDto corpBasicDto1 = new CorpBasicDto();
            BeanUtils.copyProperties(corpBasic1, corpBasicDto1);
            return corpBasicDto1;
        }).collect(Collectors.toList()));
        return pageDto;
    }
}
