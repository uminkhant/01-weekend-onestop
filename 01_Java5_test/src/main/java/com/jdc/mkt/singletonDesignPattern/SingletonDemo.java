package com.jdc.mkt.singletonDesignPattern;

public class SingletonDemo {

	public static void main(String[] args) {
		Day d1 = Day.getInstance();
		Day d2 = Day.getInstance();
		
		System.out.println(d1 == d2);
	}
}
