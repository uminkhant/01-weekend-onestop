package com.jdc.mkt.test;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class StringRegexTest {

	
	//@Test
	void stringRegexCharacterTest() {
		System.out.println(Pattern.matches("..s", "abssc")); // false : more than  three character
		System.out.println(Pattern.matches("[xyz]", "xx")); 
		System.out.println(Pattern.matches("[^xyz]", "00"));
		System.out.println(Pattern.matches("[a-zA-Z]", "0"));
		System.out.println(Pattern.matches("[^a-zA-Z]", "00"));
		System.out.println(Pattern.matches("[^a-zA-Z]", "00"));
		System.out.println(Pattern.matches("[a-z&&[^def]]", "d"));
	}
	
	//@Test
	void stringRegexQuantifierTest() {
		System.out.println(Pattern.matches("[abc]?", "aa")); // one pattern
		System.out.println(Pattern.matches("[abc]+", "abac")); //one or more
		System.out.println(Pattern.matches("[abc]*", ""));// zero or more time
	}
	
	//@Test
	void stringRegexMetaCharacterTest() {
		System.out.println(Pattern.matches("\\d", "2")); //short [0-9]
		System.out.println(Pattern.matches("\\D", "2"));//short[^0-9]
		System.out.println(Pattern.matches("\\s", " ")); //short[\t\n\x0B\f\r]
		System.out.println(Pattern.matches("\\S", "2")); //short[^\s]
		System.out.println(Pattern.matches("\\w", "w")); //short[0-9a-zA-Z]
		System.out.println(Pattern.matches("\\W", "w"));//short[^\w]
	
	}
	
@Test
	void stringRegexTest() {
		
		System.out.println(Pattern.matches("[a-z0-9]{5,}@[a-z]{3,}.com", "uminks12@gmail.com"));
	}
}
