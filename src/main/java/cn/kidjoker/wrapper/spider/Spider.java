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
 *	创建时间: 2018年1月19日 上午11:18:40
 */
package cn.kidjoker.wrapper.spider;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.kidjoker.wrapper.config.Config;
import cn.kidjoker.wrapper.pipline.Pipeline;
import cn.kidjoker.wrapper.response.Parser;
import cn.kidjoker.wrapper.response.Response;
import cn.kidjoker.wrapper.response.Result;
import cn.kidjoker.wwrapper.request.Request;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月19日 上午11:18:40
 */
public abstract class Spider {
	
	protected String name;
	
	protected Config config;
	
	protected List<String> startUrls = new ArrayList<>();
	
	protected List<Pipeline> pipelines = new ArrayList<>();
	
	protected List<Request> requests = new ArrayList<>();

	public Spider(String name) {
		this.name = name;
	}
	
	//爬虫启动前的操作
	public void beforeStart() {
		
	}
		
	//配置爬取地址
	public Spider startUrls(String... urls) {
		this.startUrls.addAll(Arrays.asList(urls));
		return this;
	}
	
	//构建Request
	public <T> Request<T> makeRequest(String url, String requestMethod, Parser<T> parser) {
		return new Request<>(this, "GET", url, parser);
	}
	
	//添加Pipeline操作
	public <T> Spider addPipeline(Pipeline<T> pipeline) {
		this.pipelines.add(pipeline);
		return this;
	}
	
	//解析DOM(方法模板)
	protected abstract <T> Result<T> parse(Response response);
	
}
