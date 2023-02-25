package com.jdc.mkt.enumWithStaticImport;

import static com.jdc.mkt.enumWithStaticImport.testImport.Data.name;
import static com.jdc.mkt.enumWithStaticImport.testImport.Data.showName;

public class StaticImportDemo {

	public static void main(String... args) {
		name = "Su Su";
		showName();
		
		
		
		//test varargs
		VarArgsDemo v = new VarArgsDemo();
		v.setNames("rwer","adsa","asdfad","asd");
		v.showAllNames();
		Hello h = new Hello();
		System.out.println(h);
		
		
	}
	
	
}	
	class Hello{
		@Override
		public String toString() {
			return "Hello class";
		}
	}
	
	
	
	
	
	
	
	
