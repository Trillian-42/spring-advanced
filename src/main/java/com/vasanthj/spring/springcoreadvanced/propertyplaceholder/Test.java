package com.vasanthj.spring.springcoreadvanced.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/vasanthj/spring/springcoretraining/propertyplaceholder/config.xml");
		MyDao dao = (MyDao) ctx.getBean("myDao");
		System.out.println(dao);
	}

}
