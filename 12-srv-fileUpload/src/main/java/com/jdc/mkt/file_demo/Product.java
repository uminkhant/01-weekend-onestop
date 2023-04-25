package com.jdc.mkt.file_demo;

public class Product {

	private String category;
	private String item;
	private int price;
	private int qty;
	
	public Product() {
		super();
	}
	
	public Product(String line) {
		
		var array = line.split("\t");
		
		this.category = array[0];
		this.item = array[1];
		this.price = Integer.parseInt(array[2]);
		this.qty =  Integer.parseInt(array[3]);
	}
	public String getCategory() {
		return category;
	}
	public String getItem() {
		return item;
	}
	public int getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	
	public int getTotal() {
		return price*qty;
	}
	
}
