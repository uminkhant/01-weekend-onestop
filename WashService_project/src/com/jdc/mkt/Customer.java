package com.jdc.mkt;

public class Customer {

	private String name;
	private String phone;
	
	private Vehicle[] services;
	

	Customer(String name,String phone,Vehicle[] services){
		this.name = name;
		this.phone = phone;
		this.services = services;
	}
	
	public String getName() {
		return name;
	}
	

	public String getPhone() {
		return phone;
	}
	
	public Vehicle[] getServices() {
		return services;
	}
	
	
}
