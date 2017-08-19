/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.gds.weixin.dao.po;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 
 * 
 * 
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TalkPO{

	/****/
	private Integer id;

	/**说**/
	private String say;



	public void setId(Integer id){
		this.id=id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setSay(String say){
		this.say=say;
	}

	public String getSay(){
		return this.say;
	}

}
