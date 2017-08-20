/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.dao.response;

import lombok.Data;

import java.io.Serializable;

/**
 * TODO: 请添加描述
 *
 * @author gongdaoshun
 * @date 2017/8/20
 * @since 1.0.0
 */
@Data
public class AccessTokenResponse implements Serializable{
    private String errcode;
    private String errmsg;
    private String access_token;
    private String expires_in;
}
