package com.ifohoo.firm25.ifms.middata.secu.service;

import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.firm25.ifms.middata.secu.domain.SecuBasic;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author hejie
 * @description 针对表【SECU_BASIC(证券基本信息表)】的数据库操作Service
 * @createDate 2023-02-10 23:25:56
 */
public interface SecuBasicService extends IService<SecuBasic> {
    ReturnMessage findSecuBasicMap(int page, int pagesize, SecuBasic secuBasic);

    ReturnMessage findSecuBasicEsMap(Integer page, Integer pagesize, SecuBasic secuBasic);
}
