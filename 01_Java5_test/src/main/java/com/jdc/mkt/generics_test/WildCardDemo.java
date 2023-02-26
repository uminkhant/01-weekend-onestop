package com.jdc.mkt.generics_test;

public class WildCardDemo {

	private ContainerFour<?> c4;

	public static void main(String[] args) {

		ContainerFour<?> c1 = new ContainerFour<>();
		// c1.setData("ss");
		System.out.println(c1.getData());
		
		ContainerFour<C> c2 = new ContainerFour();
		upperBound(c2);
		//lowerBound(c2);
	}
	
	class A{}
	class B extends A{}
	class C extends B{}

	static void upperBound(ContainerFour<? extends B> c) {

	}

	static void lowerBound(ContainerFour<? super B> c) {
		//c.setData("");
	}

	static void show(ContainerFour<?> c) {
		// c.setData("");
	}
}

class ContainerFour<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
