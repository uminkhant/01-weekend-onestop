package com.jdc.mkt.enumWithStaticImport;

public class EnumDemo {

	public static void main(String[] args) {
		/*Role r = Role.ADMIN;
		System.out.println(r);
		int c = Constant.ADMIN;
		System.out.println(c);*/
	//	checkEnum(Role.CASHIER);
		
//		Role r = Role.CASHIER;
//		
//		r.show();
//		int count = r.getCounter();
//		System.out.println(count);
		Role r = Role.CASHIER;
	System.out.println(r.name());
		
	}
	
	static void checkEnum(Role role) {
		switch(role) {
		case ADMIN:
			System.out.println("admin role can handle entire project .");
			break;
		case CASHIER:
			System.out.println("cashier role only can handle sales.");
			break;
		case USER:
			System.out.println("user role is not handle. ");
			break;
		}
	}
}
class Constant{
	public static final int ADMIN = 1;
	public static final int CASHIER = 2;
	public static final int USER = 3;
}

interface TestOne{
	void hide();
}
abstract class TestTwo {}
enum Role implements TestOne{
	ADMIN(25) {
		@Override
		void show() {	
			System.out.println("This is admin");
		}

		@Override
		public void hide() {
			// TODO Auto-generated method stub
			
		}
	},CASHIER(44) {
		@Override
		void show() {
			System.out.println("This is cashier");
		}

		@Override
		public void hide() {
			// TODO Auto-generated method stub
			
		}
	},USER(66) {
		@Override
		void show() {
			
			System.out.println("This is user");
		}

		@Override
		public void hide() {
			// TODO Auto-generated method stub
			
		}
	};
	
	private int counter;
	//private static String name;
	
	Role(int counter){
		this.counter = counter;
	}
	
	public int getCounter() {
		return counter;
	}
	abstract void show();
	public void showData() {}
	
	
	
	

}










