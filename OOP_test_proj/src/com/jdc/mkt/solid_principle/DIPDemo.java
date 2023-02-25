package com.jdc.mkt.solid_principle;

public class DIPDemo {

	public static void main(String[] args) {
		Computer c = new Computer(new StandardKeyBoard());
		c.setupCom("standard keyboard");
	}
}

abstract class KeyBoard{
	abstract void useKeyBoard(String str);
}

class StandardKeyBoard extends KeyBoard{
	
	void useKeyBoard(String str) {
		System.out.println("Using "+str);
	}
}

class Computer{
	
	private KeyBoard keyboard;
	
	Computer(KeyBoard keyboard){
		this.keyboard = keyboard;
	}
	void setupCom(String s) {
		keyboard.useKeyBoard(s);
	}
	
	KeyBoard getKeyboard() {
		
		return keyboard ;
	}
	
	
}
