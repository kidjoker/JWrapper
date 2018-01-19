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
 *	创建时间: 2018年1月18日 下午5:40:35
 */
package cn.kidjoker.wrapper.config;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月18日 下午5:40:35
 */
public class Config implements Cloneable {
	
	/** 
	 * 读取超时设置
	 */
	private int timeout;
	
	/**
	 * 下载间隔
	 */
	private int delay = 1000;
	
	/** 
	 * 下载线程数
	 */
	private int paraelThreads = Runtime.getRuntime().availableProcessors() * 2;
	
	/**
	 * 浏览器版本
	 */
	private String userAgent = EnumUserAgent.CHROME_FOR_MAC.getValue();
	
	/**
	 * 请求队列长度
	 */
	private int queuesize;
	
	public static Config build() {
		return new Config();
	}

	public int getTimeout() {
		return timeout;
	}

	public Config timeout(int timeout) {
		this.timeout = timeout;
		return this;
	}

	public int getDelay() {
		return delay;
	}

	public Config delay(int delay) {
		this.delay = delay;
		return this;
	}

	public int getParaelThreads() {
		return paraelThreads;
	}

	public Config paraelThreads(int paraelThreads) {
		this.paraelThreads = paraelThreads;
		return this;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public Config userAgent(String userAgent) {
		this.userAgent = userAgent;
		return this;
	}

	public int getQueuesize() {
		return queuesize;
	}

	public Config queuesize(int queuesize) {
		this.queuesize = queuesize;
		return this;
	}
	
	@Override
	public Config clone() {
		try {
			return (Config)super.clone();
		}
		catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
}
