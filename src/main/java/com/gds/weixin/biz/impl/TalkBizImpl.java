/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.biz.impl;

import com.gds.weixin.biz.TalkBiz;
import com.gds.weixin.service.TalkService;
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
public class TalkBizImpl implements TalkBiz {

    @Resource
    private TalkService talkService;
    @Override
    public Integer getTalk(String say) {
        return talkService.insertTalk(say);
    }
}
