package com.ifohoo.firm25.ifms.middata.redis.corp.core;

import cn.hutool.json.JSONUtil;
import com.ifohoo.common.ifms.dto.PageDto;
import com.ifohoo.firm25.ifms.middata.common.dto.core.MidDataOperation;
import com.ifohoo.firm25.ifms.middata.common.dto.corp.CorpBasicDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hj
 * @date: 2023/2/15
 * @time: 10:27 AM
 */
@Component("corpBasicOperation")
public class CorpBasicOperation implements MidDataOperation<CorpBasicDto> {
    @Override
    public void init() {

    }

    @Autowired
    @Qualifier("middleDataRedisTemplate")
    RedisTemplate<String, Object> redisTemplate;

    @Override
    public boolean add(CorpBasicDto corpBasicDto) {
        redisTemplate.opsForList().leftPush("corp_basic", corpBasicDto);
        return true;
    }

    @Override
    public boolean addAll(List<CorpBasicDto> t) {
        t.stream().forEach(s1 -> {
            redisTemplate.opsForList().leftPush("corp_basic", s1);
        });
        return true;
    }

    @Override
    public boolean update(CorpBasicDto corpBasicDto) {
        return true;
    }

    @Override
    public boolean delete(CorpBasicDto corpBasicDto) {
        return true;
    }

    @Override
    public List<CorpBasicDto> query(CorpBasicDto corpBasicDto) {
        return null;
    }

    @Override
    public PageDto<CorpBasicDto> queryPage(CorpBasicDto corpBasicDto, int pageNum, int pageSize) {
        return null;
    }
}
