package com.ifohoo.firm25.ifms.middata.syncdata;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ifohoo.common.ifms.common.base.ReturnMessage;
import com.ifohoo.common.ifms.common.enums.ErrorCodeEnum;
import com.ifohoo.firm25.ifms.middata.corp.domain.CorpBasic;
import com.ifohoo.firm25.ifms.middata.corp.esmapper.EsCorpBasicMapper;
import com.ifohoo.firm25.ifms.middata.corp.sqlmapper.CorpBasicMapper;
import com.ifohoo.firm25.ifms.middata.syncdata.core.SyncData;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 企业基本信息同步
 *
 * @author: hj
 * @date: 2023/2/12
 * @time: 12:34 PM
 */
@Component("corpBasic")
public class CorpBasicSyncData implements SyncData {

    Logger logger = org.slf4j.LoggerFactory.getLogger(CorpBasicSyncData.class);

    @Autowired
    private CorpBasicMapper corpBasicMapper;

    @Autowired
    private EsCorpBasicMapper esCorpBasicMapper;

    @Autowired
    private RedissonClient redissonClient;

    @Override
    public ReturnMessage doSyncData() {
        ReturnMessage returnMessage = new ReturnMessage();
        RLock corpBasic = redissonClient.getLock("corpBasic");
        try {
            boolean b = corpBasic.tryLock();
            if (!b) {
                returnMessage.setMessage("企业基本信息同步正在进行中,请稍后再试");
                return returnMessage;
            }
            Long totalCount = corpBasicMapper.selectCount(null);
            int pageSize = 10000;
            int pageNum = (int) (totalCount / pageSize) + 1;
            logger.info("企业基本信息同步总数:{}", totalCount);
            for (int i = 1; i <= pageNum; i++) {
                logger.info("企业基本信息同步当前页数:{}", i);
                List<CorpBasic> corpBasicList = corpBasicMapper.selectPage(new Page<>(i, pageSize), null).getRecords();
                esCorpBasicMapper.insertBatch(corpBasicList);
            }
        } catch (Exception e) {
            throw new RuntimeException("企业基本信息同步异常", e);
        } finally {
            if (corpBasic.isLocked() && corpBasic.isHeldByCurrentThread()) {
                corpBasic.unlock();
            }
        }
        logger.info("企业基本信息同步完成");
        returnMessage.modifyMsg(ErrorCodeEnum.NORMAL);
        return returnMessage;
    }
}
