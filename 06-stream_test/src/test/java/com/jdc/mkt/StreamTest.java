package com.jdc.mkt;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class StreamTest {

//	@Test
	@Order(1)
	void intermediateTest() {
		IntStream.rangeClosed(1, 10).filter(a -> a % 2 == 0).limit(4).skip(3).forEach(System.out::println);
	}

	// @Test
	@Order(2)
	void intermediateTestTwo() {

		List.of("3", "4", "7", "1", "2", "3", "3").stream().map(a -> Integer.parseInt(a)).distinct().sorted()
				.forEach(System.out::println);
	}

	// @Test
	@Order(3)
	void intermediateTestThree() {
		var list = Stream.of(List.of(2, 3, 4, 5), List.of(3, 4, 1, 7, 8, 9)).flatMap(s -> s.stream()).distinct()
				.toList();

		list.forEach(System.out::println);
	}

//	@Test
	@Order(4)
	void terminalTestOne() {

		var res = List.of("4", "2", "0", "7", "9").stream().map(i -> Integer.parseInt(i)).noneMatch(a -> a > 10);

		System.out.println(res);
	}

	// @Test
	@Order(5)
	void terminalTestTwo() {

		var listSm = List.of("A", "H", "SW", "B").stream().map(c -> c.toUpperCase()).toList();
		var listCap = List.of("a", "s", "b", "e", "w").stream().map(s -> s.toLowerCase()).toList();

		// listSm.stream().findFirst().ifPresent(System.out::print);

		var res = Stream.of(listSm, listCap).flatMap(s -> s.stream()).map(c -> c.toUpperCase()).distinct()
				.filter(f -> f.contains("W")).findAny().orElse("There is no elements");

		System.out.println(res);

	}

	// @Test
	@Order(6)
	void reduceTest() {
		var res = IntStream.of(3, 2, 4, 5).reduce(Integer::max).orElse(1);
		System.out.println(res);
	}

	//@Test
	@Order(7)
	void reduceMapTest() {
		//String[] str = { "4,6,3", "4,2,5" };
		List<String> list = Arrays.asList("2-3", "4-2", "6-6");
		
		var res = list.stream().map(m -> m.split("-")).flatMap(f -> Arrays.stream(f)).map(i -> Integer.parseInt(i))
				.reduce(Integer::sum).get();
		System.out.println(res);
//		var result = Arrays.stream(str).map(m -> m.split(",")).flatMap(f -> Arrays.stream(f)).map(i -> Integer.parseInt(i))
//				.reduce(Integer::sum).orElse(1);
		//System.out.println(res);
	}

	
	@Test
	@Order(8)
	void collectorTest() {
		
		List<String> list = Arrays.asList("2-3", "4-2", "6-6");
		var res = list.stream().map(m -> m.split("-")).flatMap(f -> Arrays.stream(f)).map(i -> Integer.parseInt(i))
				.reduce(Integer::sum);
		System.out.println(res);
//		String s = (String) list.stream().collect(Collectors.joining());
//		System.out.println(s);

	}

//	@Test
	@Order(9)
	void moreTest() {
		var res = Arrays.asList("1", "2", "4", "6").stream().map(i -> Integer.parseInt(i)).takeWhile(a -> a <= 2)
				.findAny();

		System.out.println(res);

	}

}
