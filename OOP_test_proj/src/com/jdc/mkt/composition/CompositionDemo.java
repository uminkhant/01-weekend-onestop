package com.jdc.mkt.composition;

public class CompositionDemo {

	private Converter converter;
	
	public CompositionDemo(Converter converter) {
		this.converter = converter;
	}

	 void test(String s) {
		int i = converter.convertToInt(s);
		System.out.println(i);
	}

	public static void main(String[] args) {
		CompositionDemo demo = new CompositionDemo(new Converter());
		demo.test("56");
	}
}

class Converter {

	int convertToInt(String str) {
		return Integer.parseInt(str);
	}
}
