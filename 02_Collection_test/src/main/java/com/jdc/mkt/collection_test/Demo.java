package com.jdc.mkt.collection_test;

import java.util.Arrays;

public class Demo {

	@SafeVarargs
	public static void main(String...args) {
	int[]datas = {3,4,5,6,7,9};	
		System.out.println("Before sort...........");
		
		System.out.println();
		System.out.println("Binary Search ....");
		int i = Arrays.binarySearch(datas, 9);
		System.out.println(i);
	}
	
}


