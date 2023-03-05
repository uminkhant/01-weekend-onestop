package com.jdc.mkt.exercise;

public class Main {

	public static void main(String[] args) {
		
		MyArray<Integer> arr1 = new MyArrayImpl<>(2,3,4,5,6);
		arr1.add(67);
		arr1.add(23);
		
		for(Integer i :arr1.getArray()) {
			System.out.print(i+ " ,");
		}
		
		System.out.println();
		//System.out.println(arr1.find(87));
		
		arr1.remove(5);
		
		for(Integer i :arr1.getArray()) {
			System.out.print(i+ " ,");
		}
	}
}
