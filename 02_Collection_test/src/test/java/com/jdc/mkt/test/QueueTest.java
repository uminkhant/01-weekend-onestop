package com.jdc.mkt.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.jupiter.api.Test;

public class QueueTest {

	//@Test
	void linkQueueTest() {

		Queue<String> q1 = new LinkedList<>();
		q1.add("SS");

		q1.offer("BB");
		q1.add("AA");

		q1.remove();
		q1.peek();
		
		System.out.println(q1.peek());
	}

//	@Test
	void priorityQueueTest() {
		Queue<String> q1 = new ArrayDeque<>(3);
		q1.add("SS");
		q1.offer("BB");
		q1.add("AA");
		q1.add("GG");
		q1.add("GG");
		System.out.println("PriorityQueue :  " + q1);
	}

	// @Test
	void dequeArrayTest() {
		Deque<String> d1 = new ArrayDeque<>(3);
		d1.addLast("XX");

		d1.add("SS");
		// d1.offer("BB");
		d1.add("AA");

		d1.add("GG");
		d1.add("GG");

		d1.removeFirst();
		d1.removeLast();
		
		// d1.addFirst("ZZ");

		System.out.println("Array Dueque : " + d1);
	}

	// @Test
	void dequeTest() {
		Deque<String> d1 = new LinkedList<>();
		d1.add("SS");
		d1.offer("BB");
		d1.add("AA");
		d1.add("GG");
		d1.add("GG");

		System.out.println("Linklist with dueqe :" + d1);
	}
}
