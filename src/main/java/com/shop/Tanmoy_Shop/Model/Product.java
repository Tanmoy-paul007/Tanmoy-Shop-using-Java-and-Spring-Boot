package com.shop.Tanmoy_Shop.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	private int id;
	private String name;
	private double price;
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product() {
		super();
	}
	
	
	
	
	//public String getMadein() {
		//return madein;
	//}
	//public void setMadein(String madein) {
		//this.madein = madein;
	//}
	//public int getStock() {
		//return stock;
	//}
	//public void setStock(int stock) {
		//this.stock = stock;
	//}
	
		
		
	
	
	
	

}
