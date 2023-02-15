package com.ifohoo.firm25.ifms.middata.core.corp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.firm25.ifms.middata.core.corp.domain.CorpBasic;

/**
 * @author hejie
 * @description 针对表【CORP_BASIC(企业基本信息表)】的数据库操作Service
 * @createDate 2023-02-10 23:21:53
 */
public interface CorpBasicService extends IService<CorpBasic> {
    /**
     * 数据库查询
     *
     * @param page
     * @param pagesize
     * @param corpBasic
     * @return
     */
    ReturnMessage findCorpBasicMap(int page, int pagesize, CorpBasic corpBasic);

    /**
     * es查询
     *
     * @param page
     * @param pagesize
     * @param corpBasic
     * @return
     */
    ReturnMessage findCorpBasicEsMap(int page, int pagesize, CorpBasic corpBasic);
}
