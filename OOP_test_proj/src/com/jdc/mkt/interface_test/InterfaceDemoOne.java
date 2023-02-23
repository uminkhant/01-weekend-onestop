package com.jdc.mkt.interface_test;

public class InterfaceDemoOne {

	public static void main(String[] args) {

		Data d = new PersonData();
		d.setData(23);
		//d.doSomething();
		System.out.println(d.getData());
		
		  int a = 23;
		
		Data d1 = new Data() {
			
			@Override
			public void setData(int i) {
				System.out.println(a);
				//a = i;
			}
			
			@Override
			public int getData() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		//a = 45;
	}
}

class PersonData implements Data {

	int i;

	@Override
	public void setData(int i) {
		this.i = i;
	}

	@Override
	public int getData() {
		return i;
	}
	
	public void doSomething() {}
}

class UserData implements Data {

	public int i;

	@Override
	public void setData(int i) {
		this.i = i;
	}

	@Override
	public int getData() {
		return i;
	}
}

interface Data {

	String name = "ss";
	static String str = "ertqe";

	void setData(int i);

	int getData();

	static void show() {
	}
	
	default void hide() {
		
	}

}











