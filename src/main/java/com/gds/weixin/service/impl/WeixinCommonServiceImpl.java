/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.service.impl;

import com.gds.weixin.dao.response.AccessTokenResponse;
import com.gds.weixin.service.WeixinCommonService;
import com.gds.weixin.util.http.HttpHelper;
import com.gds.weixin.util.json.JSONHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;

/**
 * TODO: 请添加描述
 *
 * @author gongdaoshun
 * @date 2017/8/20
 * @since 1.0.0
 */
@Service
@Slf4j
public class WeixinCommonServiceImpl implements WeixinCommonService{

    @Value("${WEIXIN_APP_URL:''}")
    private String httpUrl;
    @Value("${WEIXIN_APP_ID:''}")
    private String appId;
    @Value("${WEIXIN_APP_SECRET:''}")
    private String appSceret;
    @Value("${WEIXIN_APP_GRANT_TYPE:''}")
    private String grantType;

    private final static String CHARSET="utf-8";


    @CacheEvict(value = "accessToken")
    @Override
    public String getAccessToken() {

        Charset charset = Charset.forName(CHARSET);

        String appUrl = httpUrl+"?"+"grant_type="
                +grantType
                +"&appid="+appId
                +"&secret="+appSceret;
        String responseStr = HttpHelper.getRequestResponseBodyAsString(null,appUrl,charset,null);

        log.info("responseStr:{}",responseStr);

        AccessTokenResponse accessTokenResponse = JSONHelper.jsonToObject(responseStr,AccessTokenResponse.class);

        return accessTokenResponse.getAccess_token();
    }
}
