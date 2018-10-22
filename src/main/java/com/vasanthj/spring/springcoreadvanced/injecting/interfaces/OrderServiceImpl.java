package com.vasanthj.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

	@Autowired 
	private OrderDao dao;

	public OrderDao getDao() {
		return dao;
	}

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside Order Service Impl");
		dao.createOrder();
	}

}
