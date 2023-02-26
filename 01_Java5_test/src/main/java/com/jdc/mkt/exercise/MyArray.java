package com.jdc.mkt.exercise;

public interface MyArray<T> {

	void add(T t);
	void remove(int index);
	int find(T t);
	T[] getArray();
}
