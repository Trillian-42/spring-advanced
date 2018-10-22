package com.vasanthj.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/vasanthj/spring/springcoreadvanced/injecting/interfaces/config.xml");
		OrderService service = (OrderService) ctx.getBean("orderServiceImpl");
		service.placeOrder(); 
	}

}
