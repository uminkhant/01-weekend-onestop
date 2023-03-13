package com.jdc.mkt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CollectionsDemoTest {

	//@Test
	void shuffleTest() {
		List<Integer> list = Arrays.asList(2,4,1,5,9,2,8,2);	
		System.out.println("Before shuffle");
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println("After shuffle");
		System.out.println(list);
		System.out.println("After sort");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Frequency ");
		System.out.println(Collections.frequency(list, 2));
		System.out.println("List  >Sublist");
		List<Integer> list2 = list.subList(2, 6);
		System.out.println(list2);
		System.out.println("Disjoint");
		boolean res = Collections.disjoint(list, list2);
		System.out.println("list vs list 2  disjoint :"+res);
		List<Integer>list3 =Arrays.asList(1,12,45,27);
		System.out.println("list2 vs list3 disjoint :"+Collections.disjoint(list, list3));
	}
	
	@Test
	void unmodifiableTest() {
		List<String>list = new ArrayList<>();
		list.add("gg");
		list.add("HH");
		System.out.println(list);
		List<String> unmodiList = Collections.unmodifiableList(list);
		//unmodiList.add("SS");
		//unmodiList.remove("gg");
		System.out.println(unmodiList);
		
		System.out.println("Synchronized list");
		List<String> synList =  Collections.synchronizedList(unmodiList);
		System.out.println(synList);
	}
}





