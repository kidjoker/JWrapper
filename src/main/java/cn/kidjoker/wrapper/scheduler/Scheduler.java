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
 *	创建时间: 2018年1月19日 下午2:03:15
 */
package cn.kidjoker.wrapper.scheduler;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import cn.kidjoker.wrapper.response.Response;
import cn.kidjoker.wwrapper.request.Request;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月19日 下午2:03:15
 */
public class Scheduler {
	
	private BlockingQueue<Request> pending = new LinkedBlockingQueue<>();
	private BlockingQueue<Response> result = new LinkedBlockingQueue<>();
	
	public void addRequest(Request request) {
		try {
			this.pending.put(request);
		}
		catch (InterruptedException e) {
			System.out.println("向调度器添加 Request 出错");
		}
	}
	
	public void addResponse(Response response) {
		try {
			this.result.put(response);
		}
		catch (InterruptedException e) {
			System.out.println("向调度器添加 Response 出错");
		}
	}
	
	public Request nextRequest() {
		try {
			return 
		}
	}
	
	public boolean hasRequest() {
		return pending.size() > 0;
	}
	
	public boolean hasResponse() {
		return result.size() > 0;
	}
	
	
}
