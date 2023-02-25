package com.jdc.mkt.annotation_test;

public class DefaultAnnoDemo {
	
	@SuppressWarnings("unused")
	private static String name;

	public static void main(String[] args) {
		
		testDeprecated();
		testSaveVarArgs("");
	}
	
	@Deprecated
	static void testDeprecated() {
		
	}
	
	@SafeVarargs
	static void testSaveVarArgs(String...strs) {
		
	}
}
