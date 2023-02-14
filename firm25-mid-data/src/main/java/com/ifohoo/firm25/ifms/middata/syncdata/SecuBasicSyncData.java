package com.ifohoo.firm25.ifms.middata.syncdata;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.common.ifms.common.enums.ErrorCodeEnum;
import com.ifohoo.firm25.ifms.middata.corp.esmapper.EsCorpBasicMapper;
import com.ifohoo.firm25.ifms.middata.corp.sqlmapper.CorpBasicMapper;
import com.ifohoo.firm25.ifms.middata.secu.domain.SecuBasic;
import com.ifohoo.firm25.ifms.middata.secu.esmapper.EsSecuBasicMapper;
import com.ifohoo.firm25.ifms.middata.secu.sqlmapper.SecuBasicMapper;
import com.ifohoo.firm25.ifms.middata.syncdata.core.SyncData;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
    private EsSecuBasicMapper esSecuBasicMapper;

    @Autowired
    private RedissonClient redissonClient;


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
            Long totalCount = secuBasicMapper.selectCount(null);
            int pageSize = 10000;
            int pageNum = (int) (totalCount / pageSize) + 1;
            logger.info("证券基本信息同步总数:{}", totalCount);
            for (int i = 1; i <= pageNum; i++) {
                logger.info("证券基本信息同步当前页数:{}", i);
                List<SecuBasic> secuBasics = secuBasicMapper.selectPage(new Page<>(i, pageSize), null).getRecords();
                esSecuBasicMapper.insertBatch(secuBasics);
            }
        } catch (Exception e) {
            throw new RuntimeException("证券基本信息同步异常", e);
        } finally {
            if (secuBasicLock.isLocked() && secuBasicLock.isHeldByCurrentThread()) {
                secuBasicLock.unlock();
            }
        }
        returnMessage.modifyMsg(ErrorCodeEnum.NORMAL);
        return returnMessage;
    }
}
