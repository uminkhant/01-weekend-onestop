package com.jdc.mkt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
	private static Customer[] customers;
	private static int total;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		customers = new Customer[0];

		showGreeting("Welcome from service program");
		askCustomerAndService();
		showDailyReport();
		showGreeting("Bye Bye and See u soon ");
	}

	private static void showGreeting(String message) {
		System.out.println();
		System.out.println("====================================================================");
		System.out.println("  **************** " + message + " *****************  ");
		System.out.println("====================================================================");
		System.out.println();

	}

	private static void showDailyReport() {

		for (Customer cu : customers) {

			System.out.printf("""
					\tCustomer Name  : %s
					\tCustomer Phone : %s
					""", cu.getName(), cu.getPhone());
			showService(cu.getServices());
		}

		System.out.println();
		System.out.println("\tDaily Income : " + total);
		System.out.println();
		System.out.println("------------------------------------------------");
	}

	static void showService(Vehicle[] services) {

		int cu_total = 0;
		String types = "";

		for (Vehicle s : services) {

			types += s.getType().name() + " , ";
			cu_total += s.getType().getCharges();
		}

		total += cu_total;

		System.out.printf("""
				\tService type   : %s
				\tTotal charges  : %d
				""", types, cu_total);
		System.out.println();
		System.out.println("------------------------------------------------");
	}

	static void askCustomerAndService() {

		String ask = "";

		do {
			System.out.println("Please type customer name !");
			String name = sc.next();
			System.out.println("Please type customer phone !");
			String phone = sc.next();
			Vehicle[] vehicles = selectAndSaveToArrayService();

			Customer cu = new Customer(name, phone, vehicles);
			customers = Arrays.copyOf(customers, customers.length + 1);
			customers[customers.length - 1] = cu;

			System.out.println("Do you want to add customer again /y !");
			ask = sc.next();

		} while (ask.equals("y"));

	}

	static Vehicle[] selectAndSaveToArrayService() {

		String ask = "";
		Vehicle[] vehicles = new Vehicle[0];

		do {
			System.out.println("""
					Please select your service !
						1.WASH 1000
						2.SOAP 500
						3.KIT  500

					""");
			int num = sc.nextInt();
			

			vehicles = Arrays.copyOf(vehicles, vehicles.length + 1);
			vehicles[vehicles.length - 1] =  getService("bike", num);

			System.out.println("Do you want more service y/!");
			ask = sc.next();
			
		} while (ask.equals("y"));
		return vehicles;
	}

	static Vehicle getService(String name, int num) {
		return switch (name) {
		case "bike" -> new MotorBike(Vehicle.getServiceName(num));
		default -> null;
		};
	}

}
