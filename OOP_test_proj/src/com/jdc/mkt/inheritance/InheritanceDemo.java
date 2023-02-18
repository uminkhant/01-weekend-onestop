package com.jdc.mkt.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		A b = new B();
		b.showName();
	}
	
}

class A{
	 String name;
	
	void showName() {
		System.out.println(name);
	}
}
class B extends A{
	
	void doSomething() {
		name = "John";
		showName();
	}
}
class C extends B{
	
}
