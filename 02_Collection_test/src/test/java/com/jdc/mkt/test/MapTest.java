package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

public class MapTest {

	@Test
	void hashMapTest(String...var) {
		
		System.out.println(var);
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "Singer");
		m1.put(3, "Singer");
		m1.put(4, "Map");
		m1.put(2, "MIT");
		m1.put(5, "House");
		String res = m1.put(6, "worker");
		
		assertEquals("House", m1.put(7, res));		
		
		
	}

//	@Test
	void treeMapTest() {

		Map<Data, Data> m1 = new TreeMap<>();
		m1.put(new Data(45, "AA"), new Data(45, "AA"));
		m1.put(new Data(35, "AA"), new Data(51, "ww"));
		m1.put(new Data(41, "AA"), new Data(25, "bb"));
		m1.put(new Data(12, "AA"), new Data(22, "EE"));
		m1.put(new Data(42, "AA"), new Data(18, "FF"));

		for (Entry e : m1.entrySet()) {

			System.out.println(e.getKey() + "\t" + e.getValue());
		}
	}

//	@Test
	void linkHashMapTest() {
		Map<String, String> m1 = new LinkedHashMap<>();
		m1.put("S", "Singer");
		m1.put("s", "Singer");
		m1.put("M", "Map");
		m1.put("M", "MIT");
		m1.put("H", "House");

		for (Entry e : m1.entrySet()) {

			System.out.println("Key  :  %s , Value  : %s   ".formatted(e.getKey(), e.getValue()));
		}
	}

	private class Data implements Comparable<Data> {
		private int data;
		private String name;

		public Data(int data, String name) {
			this.data = data;
			this.name = name;
		}

		public int getData() {
			return data;
		}

		public String getName() {
			return name;
		}

		@Override
		public int compareTo(Data o) {
			return name.compareTo(name);
		}

		@Override
		public String toString() {
			return data + "";
		}

	}
}
