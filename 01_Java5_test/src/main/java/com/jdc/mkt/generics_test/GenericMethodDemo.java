package com.jdc.mkt.generics_test;

import java.sql.Date;

public class GenericMethodDemo {

	public static void main(String[] args) {
		
		ContinerThree<Date> c3 = new ContinerThree<>();
		
		ContainerTwo.setContainer(c3);
		
		ContainerTwo t1 = new ContainerTwo();
		int s = t1.getName(45);
		System.out.println(s);
	}
}

class ContinerThree<T>{
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

class ContainerTwo{
	
	static<E> void setContainer(ContinerThree<E> t) {
		System.out.println(t);
	}
	
	<T> T getName(T t) {
		return t;
	}
}








