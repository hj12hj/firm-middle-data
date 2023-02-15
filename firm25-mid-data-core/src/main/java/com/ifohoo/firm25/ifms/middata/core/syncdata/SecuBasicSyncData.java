package com.ifohoo.firm25.ifms.middata.core.syncdata;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.common.ifms.common.enums.ErrorCodeEnum;
import com.ifohoo.firm25.ifms.middata.common.dto.core.MidDataOperation;
import com.ifohoo.firm25.ifms.middata.common.dto.secu.SecuBasicDto;
import com.ifohoo.firm25.ifms.middata.core.secu.domain.SecuBasic;
import com.ifohoo.firm25.ifms.middata.core.secu.mapper.SecuBasicMapper;
import com.ifohoo.firm25.ifms.middata.core.syncdata.core.SyncData;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 证券基本信息同步数据
 *
 * @author: hj
 * @date: 2023/2/14
 * @time: 9:41 AM
 */
@Component("secuBasic")
public class SecuBasicSyncData implements SyncData {
    Logger logger = LoggerFactory.getLogger(SecuBasicSyncData.class);

    @Autowired
    private SecuBasicMapper secuBasicMapper;

    @Autowired
    private RedissonClient redissonClient;

    @Value("${middle.data.type:es}")
    private String middleDataType;

    private MidDataOperation<SecuBasicDto> secuBasicMidDataOperation;


    private MidDataOperation<SecuBasicDto> getMidDataOperation() {
        if (secuBasicMidDataOperation == null) {
            secuBasicMidDataOperation = SpringUtil.getBean(middleDataType+"SecuBasicOperation", MidDataOperation.class);
        }
        if (secuBasicMidDataOperation == null) {
            throw new RuntimeException("未找到证券基本信息操作类");
        }
        return secuBasicMidDataOperation;
    }


    @Override
    public ReturnMessage doSyncData() {
        ReturnMessage returnMessage = new ReturnMessage();
        //数据量大的时候操作比较耗时 加锁防止重复操作
        RLock secuBasicLock = redissonClient.getLock("secuBasic");
        try {
            boolean b = secuBasicLock.tryLock();
            if (!b) {
                returnMessage.setMessage("证券基本信息同步正在进行中,请稍后再试");
                return returnMessage;
            }
            //先删除索引
            try {
                getMidDataOperation().init();
            } catch (Exception e) {
                logger.error("删除证券基本信息索引异常", e);
            }
            Long totalCount = secuBasicMapper.selectCount(null);
            int pageSize = 10000;
            int pageNum = (int) (totalCount / pageSize) + 1;
            logger.info("证券基本信息同步总数:{}", totalCount);
            for (int i = 1; i <= pageNum; i++) {
                logger.info("证券基本信息同步当前页数:{}", i);
                List<SecuBasic> secuBasics = secuBasicMapper.selectPage(new Page<>(i, pageSize), null).getRecords();
                List<SecuBasicDto> secuBasicDtos = secuBasics.stream().map(item -> {
                    SecuBasicDto secuBasicDto = new SecuBasicDto();
                    BeanUtils.copyProperties(item, secuBasicDto);
                    return secuBasicDto;
                }).collect(Collectors.toList());

                getMidDataOperation().addAll(secuBasicDtos);
            }
        } catch (Exception e) {
            throw new RuntimeException("证券基本信息同步异常", e);
        } finally {
            if (secuBasicLock.isLocked() && secuBasicLock.isHeldByCurrentThread()) {
                secuBasicLock.unlock();
            }
        }
        logger.info("证券基本信息同步完成");
        returnMessage.modifyMsg(ErrorCodeEnum.NORMAL);
        return returnMessage;
    }
}
