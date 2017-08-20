/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.biz.impl;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.gds.weixin.service.WeixinCommonService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * TODO: 请添加描述
 *
 * @author gongdaoshun
 * @date 2017/8/20
 * @since 1.0.0
 */
@Slf4j
public class WeixinCommonServiceTest extends BaseDaoTest{

    @Autowired
    private WeixinCommonService weixinCommonService;

    @Test
    public void getAccessTokenTest(){
        String accessToken = weixinCommonService.getAccessToken();

        log.info("当前获取的accessToken为：{}",accessToken);
    }


}
