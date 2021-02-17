package com.ruanyg.learn.spring.cyclicdependency;

import com.ruanyg.learn.spring.cyclicdependency.configuration.CyclicDependencyConfiguration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: ruanyaguang
 * @Date : 2020/4/14
 * @Info :
 */
public class CyclicDependencyTest {
	@Test
	public void testCyclicDependency() throws Exception {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclicDependencyConfiguration.class);
	}
}