package com.jdc.mkt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(OrderAnnotation.class)
public class ParameterizedDemoTest {

	@ParameterizedTest
	@ValueSource(ints = { 2, 3, 4, 5})
	@Order(1)
	void testOne(int i) {
		assertTrue(i<10);
	}

	@ParameterizedTest
	@Order(2)
	@ValueSource(strings = { "Hello", "Hi", "Huys" })
	void testTwo(String greet) {
		assertTrue(greet.startsWith("H"));
	}
	
	@ParameterizedTest
	@Order(3)
	@CsvSource( value = {"W_w","S_s","H_h"},delimiter = '_')
	void testThree(String s1,String s2) {
		assertEquals(s1, s2.toUpperCase());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
