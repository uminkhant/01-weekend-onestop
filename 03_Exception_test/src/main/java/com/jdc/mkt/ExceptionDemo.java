package com.jdc.mkt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class ExceptionDemo {

	static Animal animal = new Animal();

	public static void main(String[] args) {

		methodOne();
	}

	private static void methodOne() {
		methodTwo();

	}

	private static void methodTwo() {
		methodThree();
	}

	private static void methodThree() {

		try {
			animal.eat();
			
		} catch (RuntimeException e) {
			System.out.println("null pointer");
			
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("method base");

	}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Type {
	String value() default "Eat something";
}

class Animal {
	@Type("Food")
	void eat() {

//		try {
			
//			Method m = Animal.class.getDeclaredMethod("eat");
//
//			Type type = m.getAnnotation(Type.class);
//
//			if (null != type)
//				System.out.println(type.value());

//		} catch (  NoSuchMethodException | NullPointerException ex) {
//			ex.printStackTrace();
//		}

	}
}
