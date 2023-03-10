package com.ifohoo.firm25.ifms.middata.corp.sqlmapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ifohoo.firm25.ifms.middata.corp.domain.CorpBasic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * @author hejie
 * @description 针对表【CORP_BASIC(企业基本信息表)】的数据库操作Mapper
 * @createDate 2023-02-10 23:21:53
 * @Entity corp.domain.CorpBasic
 */
public interface CorpBasicMapper extends BaseMapper<CorpBasic> {
    /**
     * 分页查询
     *
     * @param page
     * @return
     */
    IPage<CorpBasic> findAllPage(IPage<CorpBasic> page);
}




