/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.dao.repository;

import com.gds.weixin.dao.po.TalkPO;
import org.apache.ibatis.annotations.Mapper;


/**
 * 
 * TalkMapper数据库操作接口类
 * 
 **/
public interface TalkMapper{

    /**
     *
     * @param talkPO
     * @return
     */
    public Integer insertSelective(TalkPO talkPO);

}