package com.jdc.mkt.exercise;

import java.util.Arrays;

public class MyArrayImpl<T> implements MyArray<T> {

	private T[] array;

	@SafeVarargs
	public MyArrayImpl(T... array) {
		this.array = array;
	}

	private T[] unlimited(T t,T[] arrays) {

		arrays = Arrays.copyOf(arrays, arrays.length + 1);
		arrays[arrays.length - 1] = t;
		return arrays;
	}

	@Override
	public void add(T t) {
		array = unlimited(t,array);
	}

	@Override
	public void remove(int index) {
		
		T[] temp = Arrays.copyOf(array, 0);

		
		for (int x = 0; x < array.length; x++) {
					
			if (x == index) {
				continue;
			}
			temp = unlimited(array[x], temp);
			
		}
		
		
		array = temp;

	}

	@Override
	public int find(T t) {

		for (int i = 0; i < array.length; i++) {

			if (t == array[i]) {
				return i;
			}

		}
		return -1;
	}

	@Override
	public T[] getArray() {
		return array;
	}

}
