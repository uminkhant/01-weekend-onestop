package com.jdc.mkt.interface_test;

public class InterfaceDemoTwo {

	public static void main(String[] args) {
		
		AA a = new AA();
		BB b = (BB) a; //
		a = b; // 
		
		Human h = new HtunNyo();
		Male m = new HtunNyo();
		
	}
}

class AA{}
class BB extends AA{}
class CC extends BB{}

class HtunNyo implements Human,Male,Adult{

	@Override
	public void goOutside() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}}


interface Human{
	void sleep();
	void eat();
}
interface Male{
	void doWork();
}
interface Female{
	void keepThings();
}
interface Adult{
	void goOutside();
}


