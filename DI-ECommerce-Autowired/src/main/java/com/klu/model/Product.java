package com.klu.model;

import org.springframework.stereotype.Component;
@Component
public class Product {
	private int productId;
	private String productName;
	private double price;
	private String category;
	public Product() {//zero argument constructor
		this.productId=101;
		this.productName="Charger";
		this.price=2500;
		this.category="Wire";
		
	}
	//getter method to retrieve the values
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
}
