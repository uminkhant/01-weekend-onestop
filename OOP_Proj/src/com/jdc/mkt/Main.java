package com.jdc.mkt;

import java.util.Scanner;

public class Main {

	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		Passenger p = askPassenger();
		
		goTrip(p);
		
	}
	
	//go trip
	static void goTrip(Passenger p) {
		
		System.out.printf("%s hv phone number : %s and %s"
				,p.getName()
				,p.getPhone()
				,p.getCar().travelling());
	}
	
	static Passenger askPassenger() {
		System.out.println("Please type name ");
		String name = sc.nextLine();
		System.out.println("Please type phone ");
		String phone = sc.next();
		System.out.println("""
				Select Car Type by number (1,2,3)!
				
				1.MiniBus
				2.HighAce
				3.Express
				
				""");
		int selector = sc.nextInt();
		
		Car car = selectCarType(selector);
		Passenger p = new Passenger();
		p.setName(name);
		p.setPhone(phone);
		p.setCar(car);
		return p;
	}
	
	//choose cartype
	private static Car selectCarType(int selector) {
		
		return switch(selector) {
		case 1 -> new MiniBus();
		case 2 -> new HighAce();
		case 3 -> new Express();
		
		default -> null;
		};
		
	}
	
	
}
