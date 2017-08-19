/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.api;

import com.gds.weixin.biz.TalkBiz;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * TODO: 请添加描述
 *
 * @author gongdaoshun
 * @date 2017/8/18
 * @since 1.0.0
 */
@RestController
@RequestMapping("/v1/weixin/talk")
public class TalkApi {

    @Resource
    private TalkBiz talkBiz;

    @GetMapping("/say")
    @ResponseBody
    public String getHello(){

        talkBiz.getTalk("hello weixin");

        return "hello weixin";
    }
}
