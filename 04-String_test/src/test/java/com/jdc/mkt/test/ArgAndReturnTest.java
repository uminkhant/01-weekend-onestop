package com.jdc.mkt.test;

import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.jupiter.api.Test;

public class ArgAndReturnTest {

	@Test
	void argTest() {

		Consumer<String> c1 = a -> System.out.println("Hello :" + a);

		Consumer<Consumer<String>> c2 = a -> c1.accept("Consumer");
		c2.accept(c1);
	}

	@Test
	void returnTest() {

		Function<String, Integer> fun1 = str -> Integer.parseInt(str);
		Function<Function<String, Integer>, Integer> fun2 = f -> f.apply("45");
		var res = fun2.apply(fun1);
		System.out.println(res);
	}
	
	
	
}
