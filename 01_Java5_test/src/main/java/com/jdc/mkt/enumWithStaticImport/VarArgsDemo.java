package com.jdc.mkt.enumWithStaticImport;

public class VarArgsDemo {

	private String[]names;
	
	void setNames(String...names) {
		this.names = names;
	}
	
	void showAllNames() {
		for(String s:names){
			System.out.println(s);
		}
	}
}
