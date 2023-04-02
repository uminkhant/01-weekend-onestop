package com.jdc.mkt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamCreationDemo {

	public static void main(String[] args) {
		
		String[]strs = {"AA","BB","HH","aa"};
		Arrays.stream(strs).forEach(System.out::print);
		
		List<Integer>list = Arrays.asList(2,3,4,5,6);
		list.stream().forEach(System.out::println);
		
		IntStream.range(1, 10).forEach(System.out::println);
		LongStream.of(2,5,6,7,8,1,11).forEach(System.out::println);
		DoubleStream.of(2.1,3.4).forEach(System.out::println);
		
		DoubleStream.generate(Math::random)
		.limit(5)
		.mapToInt(d -> (int)d)	
		.forEach(System.out::println);
	
	}
}
