package com.vasanthj.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component
public class OrderDaoImpl implements OrderDao {

	@Override
	public void createOrder() {
		System.out.println("Inside order dao impl"); 
	}

} 
