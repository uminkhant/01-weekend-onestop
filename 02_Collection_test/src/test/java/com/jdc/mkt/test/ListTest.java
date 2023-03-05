package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTest {

	//@Test
	void listTest() {
		List<Data> list = new ArrayList<>(); 
		
		list.add(new Data());
		list.add(new Data());
		list.add(new Data());
		
	//	System.out.println("List : "+list);
		assertTrue(list.size() == 3);
		assertEquals(3, list.size());
		
	}
	@Test
	void arrayListTest() {
		ArrayList<Integer>aList = new ArrayList<>();
		aList.add(4);
		aList.add(2);
		aList.add(5);
		aList.add(4);
		aList.add(5);
		
		System.out.println("Array List : "+aList);
		assertEquals(5, aList.size());
		
		List<Integer> subList = aList.subList(1, 4);
		System.out.println("Sub List : "+subList);
		assertEquals(3, subList.size());
		
		
	}
	//@Test
	void linkListTest() {
		LinkedList<String>link = new LinkedList<>();
		link.add("AA");
		link.add("CC");
		link.add("BB");
		
		link.remove();
		System.out.println(link);
		link.remove("BB");
		System.out.println(link);
		link.remove(0);
	
		assertTrue(link.isEmpty());
		
		link.add("GG");
		link.add("FF");
		link.add(1, "HH");
		
		System.out.println("Link :"+link);
		assertEquals(3, link.size());
		assertEquals("GG", link.get(0));
		assertEquals(1, link.indexOf("HH"));
		System.out.println(link.indexOf("SS"));
		assertEquals(2, link.lastIndexOf("FF"));
	}
}

class Data{
	
}





