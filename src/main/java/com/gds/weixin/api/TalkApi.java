/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.api;

import com.gds.weixin.biz.TalkBiz;
import com.gds.weixin.dao.po.TalkPO;
import com.gds.weixin.service.TalkService;
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

    @Resource
    private TalkService talkService;

    @GetMapping("/say")
    @ResponseBody
    public String getHello(){

        talkBiz.getTalk("hello weixin");

        return "hello weixin";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){

        TalkPO loaded = talkService.findById("1");

        System.out.println("loaded="+loaded);

        TalkPO cached = talkService.findById("1");

        System.out.println("cached="+cached);

        loaded = talkService.findById("2");

        System.out.println("loaded2="+loaded);

        return "ok";

    }





    @RequestMapping("/delete")
    @ResponseBody
    public
    String delete(String id){

        talkService.deleteFromCache(id);

        return "ok";

    }
}
