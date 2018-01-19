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
 *	创建时间: 2018年1月19日 下午12:04:15
 */
package cn.kidjoker.wrapper.utils;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.jsoup.select.Evaluator.IsEmpty;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月19日 下午12:04:15
 */
public class KidjokeRUtils {
	
	public static void sleep(long time) {
		try {
			TimeUnit.MILLISECONDS.sleep(time);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static <E> boolean IsEmpty(Collection<E> collection) {
		return (null == collection) || (collection.size() == 0);
	}
}
