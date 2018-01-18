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
 *	创建时间: 2018年1月18日 下午5:24:31
 */
package cn.kidjoker.wrapper.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月18日 下午5:24:31
 */
public class EventManager {
	
	private static final Map<KidEvent, List<Consumer<Config>>> KidEventConsumeMap = new HashMap<K, V>();
}
