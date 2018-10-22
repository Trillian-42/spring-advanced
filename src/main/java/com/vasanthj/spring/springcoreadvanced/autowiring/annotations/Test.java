package com.vasanthj.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/vasanthj/spring/springcoreadvanced/autowiring/annotations/config.xml");
		Employee employee = (Employee) ctx.getBean("emp");
		System.out.println(employee);
	}

}
