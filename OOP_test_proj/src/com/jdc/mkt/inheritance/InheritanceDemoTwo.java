package com.jdc.mkt.inheritance;

public class InheritanceDemoTwo {

	public static void main(String[] args) {
		
		
		
		Person s1 = new Student();
		s1.eat();
		s1.sleep();
	}
}

class X{}
class Y extends X{}

 class Person {
	 
	
	 X eat() {
		System.out.println("person is eating ");
		return new X();
	}
	
	 void  sleep() {
		System.out.println("person is sleeping");
	}
	
	
}
class Student extends Person{
	
	
	void study() {}
	
	@Override
	protected Y eat() {
		
		System.out.println("student is eating ");
		return new Y();
	}
	@Override
	 void sleep() {
		System.out.println("student is sleeping");
		
	}
}











