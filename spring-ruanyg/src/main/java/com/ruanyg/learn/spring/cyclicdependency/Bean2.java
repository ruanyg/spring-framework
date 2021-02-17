package com.ruanyg.learn.spring.cyclicdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: ruanyaguang
 * @Date : 2020/4/14
 * @Info :
 */
@Component
public class Bean2 {
	@Autowired
	private Bean1 bean1;
}
