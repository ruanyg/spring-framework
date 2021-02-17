package com.ruanyg.learn.spring.transfer;

import com.ruanyg.learn.spring.transfer.configuration.TransferConfiguration;
import com.ruanyg.learn.spring.transfer.service.impl.TransferServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: ruanyaguang
 * @Date : 2020/4/13
 * @Info :
 */
public class TransferTest {
	@Test
	public void testTransfer() throws Exception {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransferConfiguration.class);
		TransferServiceImpl transferService = (TransferServiceImpl) applicationContext.getBean("transferService");
		transferService.transfer("6029621011001", "6029621011000", 200);
	}
}