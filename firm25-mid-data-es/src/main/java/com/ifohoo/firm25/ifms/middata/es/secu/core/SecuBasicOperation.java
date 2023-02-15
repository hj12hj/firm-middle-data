package com.ifohoo.firm25.ifms.middata.es.secu.core;

import cn.easyes.core.biz.PageInfo;
import cn.easyes.core.conditions.LambdaEsQueryWrapper;
import com.ifohoo.common.ifms.dto.PageDto;
import com.ifohoo.firm25.ifms.middata.common.dto.core.MidDataOperation;
import com.ifohoo.firm25.ifms.middata.common.dto.corp.CorpBasicDto;
import com.ifohoo.firm25.ifms.middata.common.dto.secu.SecuBasicDto;
import com.ifohoo.firm25.ifms.middata.es.opetation.EsTemplate;
import com.ifohoo.firm25.ifms.middata.es.secu.domain.SecuBasic;
import com.ifohoo.firm25.ifms.middata.es.secu.mapper.EsSecuBasicMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: hj
 * @date: 2023/2/15
 * @time: 10:10 AM
 */
@Component("secuBasicOperation")
public class SecuBasicOperation implements MidDataOperation<SecuBasicDto> {

    @Autowired
    private EsSecuBasicMapper esSecuBasicMapper;

    @Autowired
    EsTemplate esTemplate;

    @Override
    public void init() {
        try {
            esSecuBasicMapper.deleteIndex("secu_basic");
            esSecuBasicMapper.createIndex();
            esTemplate.setMaxResultWindow("secu_basic", 6000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(SecuBasicDto secuBasicDto) {
        SecuBasic secuBasic = new SecuBasic();
        BeanUtils.copyProperties(secuBasicDto, secuBasic);
        return esSecuBasicMapper.insert(secuBasic) > 0;
    }

    @Override
    public boolean addAll(List<SecuBasicDto> secuBasicDtos) {
        List<SecuBasic> secuBasics = secuBasicDtos.stream().map(secuBasicDto -> {
            SecuBasic secuBasic = new SecuBasic();
            BeanUtils.copyProperties(secuBasicDto, secuBasic);
            return secuBasic;
        }).collect(Collectors.toList());
        return esSecuBasicMapper.insertBatch(secuBasics) > 0;
    }

    @Override
    public boolean update(SecuBasicDto secuBasicDto) {
        SecuBasic secuBasic = new SecuBasic();
        BeanUtils.copyProperties(secuBasicDto, secuBasic);
        return esSecuBasicMapper.updateById(secuBasic) > 0;
    }

    @Override
    public boolean delete(SecuBasicDto secuBasicDto) {
        SecuBasic secuBasic = new SecuBasic();
        BeanUtils.copyProperties(secuBasicDto, secuBasic);
        return esSecuBasicMapper.deleteById(secuBasic) > 0;
    }

    @Override
    public List<SecuBasicDto> query(SecuBasicDto secuBasicDto) {
        SecuBasic secuBasic = new SecuBasic();
        BeanUtils.copyProperties(secuBasicDto, secuBasic);
        LambdaEsQueryWrapper<SecuBasic> queryWrapper = new LambdaEsQueryWrapper();
        if (StringUtils.isNotBlank(secuBasic.getSecuFullname())) {
            queryWrapper.match(SecuBasic::getSecuFullname, secuBasic.getSecuFullname());
        }
        List<SecuBasic> secuBasics = esSecuBasicMapper.selectList(queryWrapper);
        return secuBasics.stream().map(secuBasics1 -> {
            SecuBasicDto corpBasicDto1 = new SecuBasicDto();
            BeanUtils.copyProperties(secuBasics1, corpBasicDto1);
            return corpBasicDto1;
        }).collect(Collectors.toList());
    }

    @Override
    public PageDto<SecuBasicDto> queryPage(SecuBasicDto secuBasicDto, int pageNum, int pageSize) {
        SecuBasic secuBasic = new SecuBasic();
        BeanUtils.copyProperties(secuBasicDto, secuBasic);
        LambdaEsQueryWrapper<SecuBasic> queryWrapper = new LambdaEsQueryWrapper();
        if (StringUtils.isNotBlank(secuBasic.getSecuFullname())) {
            queryWrapper.match(SecuBasic::getSecuFullname, secuBasic.getSecuFullname());
        }
        PageInfo<SecuBasic> secuBasicPageInfo = esSecuBasicMapper.pageQuery(queryWrapper, pageNum, pageSize);
        List<SecuBasic> secuBasics = secuBasicPageInfo.getList();
        long total = secuBasicPageInfo.getTotal();
        PageDto<SecuBasicDto> pageDto = new PageDto<>();
        pageDto.setTotal(total);
        pageDto.setList(secuBasics.stream().map(secuBasics1 -> {
            SecuBasicDto corpBasicDto1 = new SecuBasicDto();
            BeanUtils.copyProperties(secuBasics1, corpBasicDto1);
            return corpBasicDto1;
        }).collect(Collectors.toList()));
        return pageDto;
    }
}
