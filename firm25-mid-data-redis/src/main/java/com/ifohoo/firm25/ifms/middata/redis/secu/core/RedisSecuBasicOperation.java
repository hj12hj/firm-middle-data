package com.ifohoo.firm25.ifms.middata.redis.secu.core;

import cn.hutool.json.JSONUtil;
import com.ifohoo.common.ifms.dto.PageDto;
import com.ifohoo.firm25.ifms.middata.common.dto.core.MidDataOperation;
import com.ifohoo.firm25.ifms.middata.common.dto.secu.SecuBasicDto;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: hj
 * @date: 2023/2/15
 * @time: 1:38 PM
 */
@Component("redisSecuBasicOperation")
public class RedisSecuBasicOperation implements MidDataOperation<SecuBasicDto> {

    @Resource(name = "middleDataRedisTemplate")
    RedisTemplate<String, Object> redisTemplate;

    @Override
    public void init() {

    }

    @Override
    public boolean add(SecuBasicDto secuBasicDto) {
        return false;
    }

    @Override
    public boolean addAll(List<SecuBasicDto> secuBasicDtos) {
        secuBasicDtos.stream().map(secuBasicDto -> JSONUtil.toJsonStr(secuBasicDto)).forEach(s -> {
            redisTemplate.opsForList().leftPush("secu_basic", s);
        });
        return true;
    }

    @Override
    public boolean update(SecuBasicDto secuBasicDto) {
        return false;
    }

    @Override
    public boolean delete(SecuBasicDto secuBasicDto) {
        return false;
    }

    @Override
    public List<SecuBasicDto> query(SecuBasicDto secuBasicDto) {
        return null;
    }

    @Override
    public PageDto<SecuBasicDto> queryPage(SecuBasicDto secuBasicDto, int pageNum, int pageSize) {
        return null;
    }
}
