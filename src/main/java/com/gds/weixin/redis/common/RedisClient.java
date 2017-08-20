/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.redis.common;

import java.util.Set;

/**
 * Redis客户端工具接口定义
 *
 * @author gongdaoshun
 * @date 2017/8/20
 * @since 1.0.0
 */
public interface RedisClient {
    public long del(Object cacheName, Object... keys);

    public void set(byte[] key, byte[] value, long liveTime);

    public void set(Object cacheName, Object key, Object value, long liveTime);

    public void set(Object cacheName, Object key, Object value);

    public void set(byte[] key, byte[] value);

    /**
     * 获取redis value (String)
     *
     * @param key
     * @return
     */
    public <T> T get(byte[] key);

    public <T> T get(Object cacheName, Object key);

    public Set keys(byte[] pattern);

    public Set keys(String pattern);

    public boolean exists(byte[] key);

    public boolean exists(Object cacheName, Object key);

    public boolean flushDb();

    public long dbSize();

    public String ping();
}
