package com.ifohoo.firm25.ifms.middata.secu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifohoo.firm25.ifms.middata.secu.domain.SecuListingDate;
import com.ifohoo.firm25.ifms.middata.secu.sqlmapper.SecuListingDateMapper;
import com.ifohoo.firm25.ifms.middata.secu.service.SecuListingDateService;
import org.springframework.stereotype.Service;

/**
* @author hejie
* @description 针对表【SECU_LISTING_DATE(证券上市日期表(针对发行代码不等于上市代码)表)】的数据库操作Service实现
* @createDate 2023-02-10 23:25:56
*/
@Service
public class SecuListingDateServiceImpl extends ServiceImpl<SecuListingDateMapper, SecuListingDate>
    implements SecuListingDateService {

}




