/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.service.impl;

import com.gds.weixin.dao.po.TalkPO;
import com.gds.weixin.dao.repository.TalkMapper;
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
public class TalkServiceImpl implements TalkService{

    @Resource
    private TalkMapper talkMapper;

    public Integer insertTalk(String say){
        TalkPO talkPO = new TalkPO().builder().say(say).build();
        return talkMapper.insertSelective(talkPO);
    }

}
