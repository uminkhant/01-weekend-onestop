package com.jdc.mkt.overload_test;

public class OverloadDemo {

	public static void main(String[] args) {
		Data  d = new Data("Hello");
		d.show(2);
	}
	
	
}

class Data{
	
	Data(){
		System.out.println("constructor without params ");
	}
	
	Data(String mess){
		System.out.println("constructor with params :"+mess);
	}
	
	 void show() {
		System.out.println("Without params");
	}
	 
	 void show(String s,int i) {
		 
	 }
	 
	 void show(int a) {
		
	 }
}
