package com.jdc.mkt.interface_test;

public class InterfaceDemoThree {

}



interface A{
	default void doSomething() {
		System.out.println("Do something from A");
	}
}
interface B extends A{}
interface C extends A{}

interface D extends B,C{
	
	@Override
	default void doSomething() {
		// TODO Auto-generated method stub
		C.super.doSomething();
	}
}

