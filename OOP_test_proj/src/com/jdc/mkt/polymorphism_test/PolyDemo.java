package com.jdc.mkt.polymorphism_test;

public class PolyDemo {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		
		Shape s1 = t1;
		
		Color c1 = t1;
		
		Object o1 = t1;
		
		s1.draw();
		
		
		//s1.mixedColor("Pink ","Blue ","Green");
		
		
		
	}
}

class Triangle extends Color implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing triangle shape");
	}
	
}

class Square extends Color implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing square shape");
	}
	
}

abstract class Color {

	void mixedColor(String... str) {

		String res = "";

		for (String s : str)
			res += s;
		
		System.out.println(res);
	}
}

interface Shape {
	void draw();
}
