/*
 * ================================================================
 * Copyright 2008-2017 Everelegance.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Everelegance Corp. Ltd, ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Everelegance.
 * 
 * OPay项目组
 *
 * ================================================================
 *  创建人: jinzhijie
 *	创建时间: 2018年1月19日 上午11:36:06
 */
package cn.kidjoker.wrapper.response;

import java.io.InputStream;

import cn.kidjoker.wwrapper.request.Request;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月19日 上午11:36:06
 */
public class Response {
	
	private Request request;
	
	private Body body;
	
	public Response(Request request, InputStream inputStream) {
		this.request = request;
		this.body = new Body(inputStream, request.getCharset());
	}
	
	public Body getBody() {
		return body;
	}
}
