package com.jdc.mkt;

import java.util.Scanner;

public class ExerciseDemo {

	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		setData();
	}
	
	static void setData() {
		System.out.println("Please type name !");
		String name = sc.next();
		System.out.println("Please type age !");
		int age = sc.nextInt();
		checkPerson(name, age);
		Person p = new Person(name, age);
	}
	
	static void checkPerson(String name,int age) {
		try {
			
			if(name.equals("Admin")) {
				
				throw new MyException("Person name Admin");
			}
			if(age < 0) {
				throw new MyException("Person age is lessthan 0 ");
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
			//System.out.println(e.getMessage());
		}
	}
}

class MyException extends RuntimeException{
	public MyException(String mess) {
		super(mess);
	}
}

class Person{
	
	private String name ;
	private int age;
	
	Person(String name ,int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
