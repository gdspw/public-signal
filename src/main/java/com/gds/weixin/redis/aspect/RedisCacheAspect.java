/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.redis.aspect;

import com.gds.weixin.annotation.RedisCachePut;
import com.gds.weixin.redis.common.RedisClient;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 缓存处理时间切面
 *
 * @author gongdaoshun
 * @date 2017/8/20
 * @since 1.0.0
 */
@Aspect
public class RedisCacheAspect {
    private final static char DOT='.';
    private final static char SHARP = '#';
    private RedisClient redisClient;

    public RedisClient getRedisClient() {
        return redisClient;
    }

    public void setRedisClient(RedisClient redisClient) {
        this.redisClient = redisClient;
    }

    /**
     * 对象存入缓存
     * @param pjp
     * @param cachePut
     * @return
     * @throws Throwable
     */
    @Around("@annotation(cachePut)")
    public Object cachePut(ProceedingJoinPoint pjp, RedisCachePut cachePut) throws Throwable{

        Object keyObject = getCacheKey(pjp,cachePut.key());
        Object result = pjp.proceed();

        // 不为空才保存数据
        if(result !=null && keyObject!=null){
            redisClient.set(cachePut.cacheName(),keyObject,result,cachePut.expire());
        }
        return result;

    }

    private Object getCacheKey(ProceedingJoinPoint pjp, String key) {
    }
}
