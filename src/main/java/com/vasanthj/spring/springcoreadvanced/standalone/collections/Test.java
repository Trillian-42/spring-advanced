package com.vasanthj.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/vasanthj/spring/springcoreadvanced/standalone/collections/config.xml");
		Product product = (Product) ctx.getBean("product");
		System.out.println(product);
	}

}
