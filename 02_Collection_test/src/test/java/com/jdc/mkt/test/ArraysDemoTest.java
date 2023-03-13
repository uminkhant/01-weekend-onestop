package com.jdc.mkt.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArraysDemoTest {

	@Test
	void sortTest() {
		int[] datas = { 3, 4, 5, 6, 7, 9 };
		String[] strs = { "Book", "Pen", "Sun", "Errow", "Ant" };

		System.out.println();
		System.out.println("Binary Search ....");
		Arrays.sort(strs);
		int i = Arrays.binarySearch(strs, "Errow");
		System.out.println(i);

	
	}

	@Test
	void sortCollectionTest() {
		
		List<String> list = Arrays.asList("Book", "Pen", "Sun", "Errow", "Ant");
		System.out.println("Before Sort ....");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After Sort ....");
		System.out.println(list);

		int i = Collections.binarySearch(list, "Errow");
		System.out.println(i);
	}
@SafeVarargs
	private static void loopArray(Object... objs) {
		System.out.print("[");
		for (int i = 0; i < objs.length; i++) {

			System.out.print(objs[i]);

			if (i < objs.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println();
	}
}
