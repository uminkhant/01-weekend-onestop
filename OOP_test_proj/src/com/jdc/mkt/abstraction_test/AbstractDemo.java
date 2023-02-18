package com.jdc.mkt.abstraction_test;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Shape s = new Square(34.9, 33.1);
		s.showArea();
		s.show();
		
		Shape byAno = new Shape(23.12,12.1) {

			@Override
			void showArea() {
				System.out.println("Shape :"+(base*hight));
			}
			
		};
		byAno.showArea();
		
	}
}

 abstract class Shape{
	 
	  double base;
	  double hight;
	  
	 
	
	 public Shape(double base,double hight) {
		this.base = base;
		this.hight = hight;
	}
	 abstract void showArea();
	 
	  void show() {
		 System.out.println("show something");
	  }
	 
	  
}
 
class Rectangle extends Shape{

	public Rectangle(double base, double hight) {
		super(base, hight);
		
	}

	@Override
	void showArea() {
		System.out.println("Rectangle area :"+(base*hight));
		
	}
}
class Triangle extends Shape{

	public Triangle(double base, double hight) {
		super(base, hight);
		
	}

	@Override
	void showArea() {
		System.out.println("Triangle :"+((base*hight)*2));
	}
	
}
class Square extends Shape{

	public Square(double base, double hight) {
		super(base, hight);
		
	}

	@Override
	void showArea() {
		System.out.println("Square "+(base*base));
		
	}};








