package com.ifohoo.firm25.ifms.middata.corp.service;

import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.firm25.ifms.middata.corp.domain.CorpBasic;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
* @author hejie
* @description 针对表【CORP_BASIC(企业基本信息表)】的数据库操作Service
* @createDate 2023-02-10 23:21:53
*/
public interface CorpBasicService extends IService<CorpBasic> {
    ReturnMessage findCorpBasicMap(int page, int pagesize,CorpBasic corpBasic);

    ReturnMessage findCorpBasicEsMap(int page, int pagesize,CorpBasic corpBasic);
}
