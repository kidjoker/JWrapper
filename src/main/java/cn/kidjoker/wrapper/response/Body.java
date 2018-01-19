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
 *	创建时间: 2018年1月19日 上午11:23:31
 */
package cn.kidjoker.wrapper.response;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月19日 上午11:23:31
 */
public class Body {
	
	/** 输入流 */
	private final InputStream inputStream;
	
	/** 流编码 */
	private final String charset;
	
	/** 响应体字符串 */
	private String bodyString;
	
	public Body(InputStream inputStream, String charset) {
		this.inputStream = inputStream;
		this.charset = charset;
	}
	
	@Override
	public String toString() {
		//判断是否需要从流中读取数据
		if(null == this.bodyString) {
			StringBuilder html = new StringBuilder(100);
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, charset));
				String temp = null;
				
				while((temp = br.readLine()) != null) {
					html.append(temp);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			this.bodyString = html.toString();
		}
		return this.bodyString;
	}

	public InputStream getInputStream() {
		return inputStream;
	}
	
	public Elements css(String css) {
		return Jsoup.parse(this.toString()).select(css);
	}
	
}
