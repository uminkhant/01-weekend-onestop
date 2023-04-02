package com.jdc.mkt.lambda;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class MethodReferenceTest {

	// @Test
	@Order(1)
	void staticMethodReferenceTest() {
		System.out.println("========== Test 1 ================ ");
		DataTwo d2 = MethodReferenceTest::witoutReturn;
		d2.run();
	}

	// @Test
	@Order(2)
	void instanceMethodReferenceTest() {

		MethodReferenceTest mr = new MethodReferenceTest();
		Data d = mr::stringReturn;
		String res = d.run(23, "aa");
		System.out.println(res);
	}

	@Test
	@Order(3)
	void constructorMethodReferenceTest() {
		DataThree d = MethodReferenceTest::new;
		d.run(23);
	}

	MethodReferenceTest() {
		System.out.println("Ref : constructor ");
	}

	MethodReferenceTest(int a) {
		System.out.println("with arg : " + a);
	}

	static void witoutReturn() {
		System.out.println("Ref : Static Without Return method");
	}

	String stringReturn(int a, String str) {
		return "Ref : instance with return string " + str;
	}

	interface DataThree {
		void run(int a);
	}

	interface Data {

		String run(int a, String name);

		static void show() {
		}
	}

	interface DataTwo {
		void run();
	}
}
