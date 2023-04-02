package com.jdc.mkt.lambda;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class FunctionalInterfaceTest {

	// @Test
	@Order(1)
	void testOne() {
		Function<String, Integer> fun = str -> Pattern.matches("\\d+", str) ? Integer.parseInt(str) : 0;
		int i = fun.apply("56") + 2;
		System.out.println(i);
		Function<String, Integer> fun2 = FunctionalInterfaceTest::refApply;
		System.out.println(fun2.apply("ss"));

		Predicate<String> pre1 = str -> Pattern.matches("[a-zA-Z]+", str);

		Predicate<String> pre2 = FunctionalInterfaceTest::refTest;
		if (pre2.test("asda")) {
			System.out.println("Characters !");
		} else {
			System.out.println("others");
		}
	}

	@Test
	@Order(2)
	void biFunctionalTest() {

//		BiConsumer<Integer, Integer> plus = (a, b) -> System.out.println(a + b);
//		plus.accept(23, 45);
//		BiConsumer<Integer, Integer> d = (a, b) -> System.out.println(a + b);
//		plus.andThen(d);
		//	var res = Stream.of(List.of(3, 4, 5), List.of(6, 2)).flatMap(list -> list.parallelStream()).toList();
	//	System.out.println(res);
		System.out.println(IntStream.range(2,3).reduce(2, (a,b)->a));
	}

	static boolean refTest(String str) {
		return Pattern.matches("[a-zA-Z]+", str);
	}

	static int refApply(String str) {
		return 0;
	}

}
