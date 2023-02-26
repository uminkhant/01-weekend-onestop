package com.jdc.mkt.exercise;

import java.util.Arrays;

public class MyArrayImpl<T> implements MyArray<T>{
	
	private   T[] array  ;
	
	
	@SafeVarargs
	public MyArrayImpl(T...array) {
		this.array = array ; 		
	}
	
	private void unlimited(T t) {
		
		array = Arrays.copyOf(array, array.length+1);
		array[array.length-1] = t;
		
	}

	@Override
	public void add(T t) {
		unlimited(t);
	}

	@Override
	public void remove(int index) {
		
	}

	@Override
	public int find(T t) {
		return 0;
	}

	@Override
	public T[] getArray() {
		return array;
	}

	
}



