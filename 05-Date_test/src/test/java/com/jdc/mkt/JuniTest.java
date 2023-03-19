package com.jdc.mkt;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class JuniTest {

	@BeforeAll
	static void init() {
		System.out.println("Before All");
	}
	
	@AfterAll
	static void closed() {
		System.out.println("After All");
	}
	
	@BeforeEach
	void eachBeforeTest() {
		System.out.println("Before each");
		
	}
	@AfterEach
	void eachAfterTest() {
		System.out.println("After Each");
	}
	@Test
	@Order(3)
	void junitTestThree() {
		System.out.println("Test  Three");
	}
	@Test
	@Order(1)
	void junitTestOne() {
		System.out.println("Test  One");
	}
	@Test
	@Order(2)
	void junitTestTwo() {
		System.out.println("Test two");
	}
}
