package com.jdc.mkt.test;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class RegularExpressionTest {

//	@Test
	void characterTest() {
		
		System.out.println(Pattern.matches("..s", "ass"));
		System.out.println(Pattern.matches("[a-zA-Z]", "a"));
		System.out.println(Pattern.matches("[^a-zA-Z]", "2"));
		System.out.println(Pattern.matches("[0-9]", "4"));
		System.out.println(Pattern.matches("[a-z&&[a-d]]", "a"));
	}
	
	//@Test
	void quentitiferTest() {
		System.out.println(Pattern.matches("a*","aaa"));
		System.out.println(Pattern.matches("a+","aaa"));
		System.out.println(Pattern.matches("a?","a"));
		System.out.println(Pattern.matches("a{3,}","aaaaa"));
	}
	
	@Test
	void regularExpressionTest() {
		System.out.println(Pattern.matches("[a-z0-9]{5,}@[a-z]{3,}.com","_2tf23@yahoo.com"));
	}
}









