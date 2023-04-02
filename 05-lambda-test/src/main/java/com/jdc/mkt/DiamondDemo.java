package com.jdc.mkt;

public class DiamondDemo {

}

interface Four extends Two, Three {

	@Override
	default void show(String str) {
		// TODO Auto-generated method stub
		Three.super.show(str);
	}

}

interface One {

	// default void show() {}
}

interface Two extends One {
	default void show(String str) {
		System.out.println("Two :" + str);
	}
}

interface Three extends One {
	default void show(String str) {
		System.out.println("Three :" + str);
	}
}
