/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.biz.impl;

import com.gds.weixin.util.http.HttpHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.CharSet;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * TODO: 请添加描述
 *
 * @author gongdaoshun
 * @date 2017/8/18
 * @since 1.0.0
 */
@Slf4j
public class TalkBizImplTest extends BaseDaoTest{




    @Test
    public void weixinTest(){
        String appId = "wx0e0a91edefebbe35";
        String appscret = "0875089a5fcd5b09c6aabd33c1c8e177";
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx0e0a91edefebbe35&secret=0875089a5fcd5b09c6aabd33c1c8e177";

        Charset charset = Charset.forName("utf-8");

        String responseStr = HttpHelper.getRequestResponseBodyAsString(null,url,charset,null);

        log.info("responseStr:{}",responseStr);
    }
}