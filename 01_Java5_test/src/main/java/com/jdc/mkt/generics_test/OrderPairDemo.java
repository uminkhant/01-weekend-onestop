package com.jdc.mkt.generics_test;

public class OrderPairDemo {

	public static void main(String[] args) {
		
		ContainerOne<Integer,String> c1 = new ContainerOne<>();
		c1.setKey(1);
		c1.setValue("Admin");
		
		System.out.printf("Key :%d , Value :%s",c1.getKey(),c1.getValue());
		
	}
}



class ContainerOne<K,V>{
	
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}
