package com.jdc.mkt.lambda;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class LabdaTest {

	
	@Test
	@Order(1)
	void beforeLambda() {
		final int i = 23;
		Data d = new Data() {

			@Override
			public String run(int a, String name) {
				a = i;
				System.out.println("run !");
				
				return "Hla Hla";
				
			}
		};
	
		String str = d.run(23, "AA");
		System.out.println(str);
	}

	@Test
	@Order(2)
	void afterLambda() {
		String name = "Su Su";
		Data d = (i, str) -> name;
	//	name = "MM";
	
		System.out.println(name);
	}
	
	
	private interface Data {

		String run(int a, String name);	
		static void show() {}
	}	
	
	
	
	
	
	
}
