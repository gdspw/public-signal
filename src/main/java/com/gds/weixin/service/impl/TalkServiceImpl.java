/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.service.impl;

import com.gds.weixin.dao.po.TalkPO;
import com.gds.weixin.dao.repository.TalkMapper;
import com.gds.weixin.service.TalkService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TODO: 请添加描述
 *
 * @author gongdaoshun
 * @date 2017/8/18
 * @since 1.0.0
 */
@Service
public class TalkServiceImpl implements TalkService{

    @Resource
    private TalkMapper talkMapper;

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    public Integer insertTalk(String say){
        TalkPO talkPO = new TalkPO().builder().say(say).build();
        return talkMapper.insertSelective(talkPO);
    }

    @Override
    public void test(){
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();

        valueOperations.set("mykey4", "random1="+Math.random());

        System.out.println(valueOperations.get("mykey4"));

    }

    //keyGenerator="myKeyGenerator"

    @Cacheable(value="talkPO") //缓存,这里没有指定key.
    @Override
    public TalkPO findById(String id) {

        System.err.println("TalkServiceImpl.findById()=========从数据库中进行获取的....id="+id);

        return talkMapper.findOne(id);

    }



    @CacheEvict(value="talkPO")
    @Override
    public void deleteFromCache(String id) {

        System.out.println("TalkServiceImpl.delete().从缓存中删除.");

    }
}
