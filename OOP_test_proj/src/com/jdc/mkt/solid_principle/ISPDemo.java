package com.jdc.mkt.solid_principle;

public class ISPDemo {

	public static void main(String[] args) {
		
	}
}

interface Smell{
	void likeRose();
	void likeFresh();
	
}

interface SmellTwo{
	void likeLovely();
}

class Flower implements Smell{

	@Override
	public void likeRose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void likeFresh() {
		// TODO Auto-generated method stub
		
	}
	
}

class Perfume implements Smell,SmellTwo{

	@Override
	public void likeRose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void likeFresh() {
		// TODO Auto-generated method stub
		
	}
	
	public void likeLovely() {
		
	}
	
}


