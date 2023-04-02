package com.jdc.mkt;

public class Data {

	private static String v;
	
	public Data() {
		super();
	}
	
	public Data(String v) {
		this.v = v;
		System.out.println("constructor from data class");
	}
	
	public void setData(String v) {
		this.v = v;
		System.out.println("set data from data class with :"+v);
	}
	
	public static String getData() {
		System.out.println("get data from data class ");
		return v;
	}
}
