package com.jdc.mkt;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class CustomExceptionDemo {

	static Data data;
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);		
		//useData();
	}

	static void useData() throws Throwable {

		try {
			System.out.println("Type number !");
			
			int i = sc.nextInt() + 1;
			System.out.println(i);
			
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new Exception("asdfadf");
			
			//throw new NullPointerException("No object created");
		}catch (MyException e) {
			throw new RuntimeException(e);	
		}
	}
}

class Data   {
	
}

@SuppressWarnings("serial")
class MyException extends RuntimeException {
	
	public MyException(String mess) {
		super(mess);
	}

}
