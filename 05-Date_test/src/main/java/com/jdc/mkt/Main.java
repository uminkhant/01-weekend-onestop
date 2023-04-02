package com.jdc.mkt;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// before stream
		List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(sum(list));

		// after stream
		int res = list.stream().mapToInt(a -> a).sum();
		System.out.println(res);
	}

	static int sum(List<Integer> list) {
		int res = 0;
		for (int i : list) {
			res += i;
		}
		return res;
	}
}
