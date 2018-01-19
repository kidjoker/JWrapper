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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

import cn.kidjoker.wrapper.config.Config;
import cn.kidjoker.wrapper.config.EnumUserAgent;

/**
 * <p>
 * 
 * </P>
 * @author jinzhijie
 * @creatTime 2018年1月18日 下午5:24:31
 */
public class EventManager {
	
	//使用观察者模式来实现事件驱动模型
	private static final Map<KidEvent, List<Consumer<Config>>> KidEventConsumeMap = new HashMap<>();
	
	public static void registerEvent(KidEvent kidEvent, Consumer<Config> consumer) {
		
		List<Consumer<Config>> consumers = KidEventConsumeMap.get(kidEvent);
		if(null == consumers) {
			consumers = new ArrayList<Consumer<Config>>();
		}
		consumers.add(consumer);
		KidEventConsumeMap.put(kidEvent, consumers);
	}
	
	public static void fireEvent(KidEvent kidEvent, Config config) {
		Optional.ofNullable(KidEventConsumeMap.get(kidEvent)).ifPresent(consumers -> consumers.forEach(consumer -> consumer.accept(config)));
	}
	
	public static void main(String[] args) {
		registerEvent(KidEvent.GLOBAL_STARTED, new Consumer<Config>() {

			@Override
			public void accept(Config t) {
				System.out.println("123");
			}
		});
		
		//使用建造者模式
		Config config = Config.build()
				.delay(1000)
				.paraelThreads(8)
				.queuesize(10)
				.timeout(1000)
				.userAgent(EnumUserAgent.CHROME_FOR_MAC.getValue());
		fireEvent(KidEvent.GLOBAL_STARTED, config);
	}
	
}
