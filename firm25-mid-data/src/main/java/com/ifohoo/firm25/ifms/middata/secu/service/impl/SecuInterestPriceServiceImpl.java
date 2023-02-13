package com.ifohoo.firm25.ifms.middata.secu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifohoo.firm25.ifms.middata.secu.domain.SecuInterestPrice;
import com.ifohoo.firm25.ifms.middata.secu.sqlmapper.SecuInterestPriceMapper;
import com.ifohoo.firm25.ifms.middata.secu.service.SecuInterestPriceService;
import org.springframework.stereotype.Service;

/**
* @author hejie
* @description 针对表【SECU_INTEREST_PRICE(债券百元利息表(系统自行计算)表)】的数据库操作Service实现
* @createDate 2023-02-10 23:25:56
*/
@Service
public class SecuInterestPriceServiceImpl extends ServiceImpl<SecuInterestPriceMapper, SecuInterestPrice>
    implements SecuInterestPriceService {

}




