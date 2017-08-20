/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.service;

import com.gds.weixin.dao.po.TalkPO;

/**
 * TODO: 请添加描述
 *
 * @author gongdaoshun
 * @date 2017/8/18
 * @since 1.0.0
 */
public interface TalkService {
    public Integer insertTalk(String say);

    public TalkPO findById(String id);

    public void deleteFromCache(String id);

    void test();
}
