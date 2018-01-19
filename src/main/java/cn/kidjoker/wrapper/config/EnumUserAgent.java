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
 *	创建时间: 2018年1月19日 上午9:57:37
 */
package cn.kidjoker.wrapper.config;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月19日 上午9:57:37
 */
public enum EnumUserAgent {
	
	SAFARI_FOR_MAC("Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_8; en-us) AppleWebKit/534.50 (KHTML, like Gecko) Version/5.1 Safari/534.50"),
	IE_9_FOR_WIN("Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0"),
	IE_8_FOR_WIN("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/4.0)"),
	IE_7_FOR_WIN("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)"),
	FIREFOX_FOR_MAC("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:2.0.1) Gecko/20100101 Firefox/4.0.1"),
	OPERA_FOR_MAC("Opera/9.80 (Macintosh; Intel Mac OS X 10.6.8; U; en) Presto/2.8.131 Version/11.11"),
	CHROME_FOR_MAC("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_0) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.56 Safari/535.11"),
	TENCENT_TT("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; TencentTraveler 4.0)"),
	THE_WORLD("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; The World)"),
	SOUGOU("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; SE 2.X MetaSr 1.0; SE 2.X MetaSr 1.0; .NET CLR 2.0.50727; SE 2.X MetaSr 1.0)"),
	QIHU_360("Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; 360SE)"),
	
	/** 
	 * 移动端
	 */
	SAFARI_FOR_IPHONE("Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5");
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	EnumUserAgent(String value) {
		this.value = value;
	}
	
	
}
