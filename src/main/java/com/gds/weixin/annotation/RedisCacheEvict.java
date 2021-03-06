/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.annotation;

import java.lang.annotation.*;

/**
 * TODO: 请添加描述
 *
 * @author gongdaoshun
 * @date 2017/8/20
 * @since 1.0.0
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RedisCacheEvict {
    /**
     * 缓存名称
     *
     * @return
     */
    String cacheName();

    /**
     * 缓存key
     *
     * @return
     */
    String key();
}
