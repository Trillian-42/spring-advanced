package com.vasanthj.spring.springcoreadvanced.standalone.collections;

import java.util.List;

public class Product {

	@Override
	public String toString() {
		return "Product [productNames=" + productNames + "]";
	}

	List<String> productNames;

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}

}
