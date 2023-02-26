package com.jdc.mkt.generics_test;

public class BoundedTypeDemo {

	public static void main(String[] args) {

		Bound<C> b1 = new Bound<>();
		b1.setData(new C());
		C c = b1.getData();
		System.out.println(c);
	}
}

class Bound<T extends B> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

class A {
}

class B extends A {
}

class C extends B {
}
