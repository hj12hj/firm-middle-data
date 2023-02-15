package com.ifohoo.firm25.ifms.middata.core.corp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ifohoo.firm25.ifms.middata.core.corp.domain.CorpBasic;

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




