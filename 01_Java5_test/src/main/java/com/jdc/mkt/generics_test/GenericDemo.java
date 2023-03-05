package com.jdc.mkt.generics_test;

public class GenericDemo {

	public static void main(String[] args) {
		
		Container<Integer> c1 = new Container<>();
		c1.setData(231);
		int a  =  c1.getData();
		
	}
}


 enum Task{
	
}

abstract class Human<T>{
	
}

interface MyInter<T>{
	void setData(T t);
	T getData();
}

class  Container<T>{
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
