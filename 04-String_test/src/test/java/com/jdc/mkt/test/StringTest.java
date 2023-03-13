package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringTest {
	String s = "Hello Java Developer";
//	@Test
	void createString() {
		String s1 = new String("Hello");		
		String s2 = s1 ;
		assertTrue(s1 == s2);
	}
	
	//@Test
	void searchTest() {
		
		System.out.println("Inded of : "+s.indexOf("e",6));
		System.out.println("End with : "+s.endsWith("er"));
		System.out.println("Start with : "+s.startsWith("He"));
		System.out.println("Contains : "+s.contains("Java"));
		System.out.println("Hello".equalsIgnoreCase("hello"));
		
	}
	
	//@Test
	void subStringTest() {
		String s2 = s.substring(6,10);
		System.out.println("Sub String : "+s2);
		String s3 = s.replace('e', 'f');
		System.out.println("Replace : "+s3);
		String s4 = s.replace("Java", "Spring");
		System.out.println("Replace regex : "+s4);
	}
//	@Test
	void  otherMethodTest() {
		String s1 = s.toUpperCase();
		System.out.println("upper case  : "+s1);
		String s2 = s.toLowerCase();
		System.out.println("lower case  : "+s2);
		String[] str = s.split("e");
		for(String s :str)
		System.out.println("Split : "+s);		
		System.out.println("Concat : ".concat(s));
	}
	@Test
	void composingStringTest() {
		//System.out.println(s.length());
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("capactiy((16*2)+2) : %d \t length : %d "
				.formatted(sb.capacity(),sb.length()));
		sb.append("Java");
		sb.append("Developer");
		sb.append("Class");
		System.out.println("capactiy((oldcapacity*2)+2) : %d \t length : %d "
				.formatted(sb.capacity(),sb.length()));
	}
}







