package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SetTest {

	// @Test
	void setTest() {

		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> linkSet = new LinkedHashSet<>();
		Set<Integer> treeSet = new TreeSet<>();

		for (int x = 5; x > 0; x--) {

			hashSet.add(x);
			linkSet.add(x);
			treeSet.add(x);
		}

		System.out.println("Hash : " + hashSet);
		System.out.println("Link : " + linkSet);
		System.out.println("Tree : " + treeSet);

		assertEquals(5, hashSet.size());
		assertEquals(5, linkSet.size());
		assertEquals(5, treeSet.size());

	}

	// @Test
	void linkSetTest() {
		Set<Person> set = new LinkedHashSet<>();

		LinkedHashSet<Person> lset = new LinkedHashSet<>();

		assertTrue(set.isEmpty());

		set.add(new Person("Soe Soe", 23));
		set.add(new Person("Moe Moe", 43));
		set.add(new Person("Toe Toe", 20));
		set.add(new Person("Aye", 13));

		lset.add(new Person("Soe Soe", 23));
		lset.add(new Person("Soe Soe", 23));

		set.addAll(lset);

		assertTrue(set.containsAll(lset));

		assertEquals(6, set.size());

	}

	@Test
	void treeSetTest() {
		Set<Person> set = new TreeSet<>();
		set.add(new Person("Soe Soe", 23));
		set.add(new Person("Moe Moe", 43));
		set.add(new Person("Toe Toe", 20));
		set.add(new Person("Aye", 13));

		System.out.println(set.size());
		// set.clear();
		for (Person p : set) {
			System.out.println("Set : " + p.getName()+"\t"+p.getAge());
		}
		
		assertFalse(set.isEmpty());

	}

	// @Test
	void hashSetTest() {
		Set<String> set = new HashSet<>();

		set.add("Hello");
		set.add("Java");
		set.add("Dev");
		set.add("Java");

		for (String str : set) {
			// System.out.println(str);
		}

		System.out.println();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			// System.out.println(itr.next());
		}

		assertEquals(3, set.size());
	}

}

class Person implements Comparable<Person> {
	private int age;
	private String name;

	Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Person p) {
		return 0;
	}

}
