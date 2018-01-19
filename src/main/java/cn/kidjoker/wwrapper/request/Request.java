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
 *	创建时间: 2018年1月19日 上午11:17:51
 */
package cn.kidjoker.wwrapper.request;

import java.util.HashMap;
import java.util.Map;

import cn.kidjoker.wrapper.response.Parser;
import cn.kidjoker.wrapper.spider.Spider;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月19日 上午11:17:51
 */
public class Request<T> {
	
	private Spider spider;
	private String url;
	private String requestMethod = "GET";
	private String contentType = "text/html;charset=UTF-8";
	private String charset = "UTF-8";
	private Parser<T> parser;
	
	private Map<String, String> headers = new HashMap<>();
	private Map<String, String> cookies = new HashMap<>();
	
	public Request(Spider spider, String requestMethod, String url, Parser<T> parser) {
		this.parser = parser;
		this.url = url;
		this.requestMethod = requestMethod;
		this.parser = parser;
		//this.headers.put("User-Agent", spider.getConfig.userAgent());
	}
	
	public Request header(String key, String value) {
		this.headers.put(key, value);
		return this;
	}
	
	public Request cookie(String key, String value) {
	    this.cookies.put(key, value);
		return this;
	}
	
	public Request contentType(String contentType) {
	    this.contentType = contentType;
	    return this;
	}
	
	public Request requestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
	
	public Request charset(String charset) {
        this.charset = charset;
        return this;
    }

	public void setParser(Parser<T> parser) {
        this.parser = parser;
    }
	
	public String getHeaders(String key) {
		return this.headers.get(key);
	}

	public String getCookies(String key) {
		return this.cookies.get(key);
	}
	
    public String getContentType() {
        return contentType;
    }

    public String getCharset() {
        return charset;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }
	
	
}
