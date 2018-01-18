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
 *	创建时间: 2018年1月18日 上午11:41:35
 */
package cn.kidjoker.wrapper.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月18日 上午11:41:35
 */
public class SpiderSample {
	
	public static void main(String[] args) {
		String url = "http://118.193.21.174:9086/coupon-oms/login.html";
		
		InputStream is = null;
		
		BufferedReader br = null;
		
		StringBuffer html = new StringBuffer();
		
		String temp = "";
		
		try {
			URL urll = new URL(url);
			
			is = urll.openStream();
			
			br = new BufferedReader(new InputStreamReader(is));
			
			while((temp = br.readLine()) != null) {
				html.append(temp);
			}
		}
		catch (Exception e) {
			throw new RuntimeException("Web Spider scrap fail!");
		}
		finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			is = null;
		}
		
		Document document = Jsoup.parse(html.toString());
		Elements elements = document.getElementsByClass("form-group");
		for(Element element : elements) {
			System.out.println(element.text());
		}
	}
}
