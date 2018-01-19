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
 *	创建时间: 2018年1月19日 上午11:59:32
 */
package cn.kidjoker.wrapper.response;

import java.util.ArrayList;
import java.util.List;

import cn.kidjoker.wrapper.utils.KidjokeRUtils;
import cn.kidjoker.wwrapper.request.Request;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月19日 上午11:59:32
 */
public class Result<T> {
	
	private List<Request> requests = new ArrayList<>();
	private T item;
	
	public Result(T item) {
		this.item = item;
	}
	
	public Result addRequest(Request request) {
		this.requests.add(request);
		return this;
	}
	
	public Result addRequests(List<Request> requests) {
		if(!KidjokeRUtils.IsEmpty(requests)) {
			requests.addAll(requests);
		}
		else {
			this.requests = requests;
		}
		return this;
	}
}
