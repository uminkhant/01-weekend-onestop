package com.jdc.mkt.lambda;

import java.util.function.Consumer;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.mkt.Data;
import com.jdc.mkt.MyInterOne;
import com.jdc.mkt.MyInterTwo;

@TestMethodOrder(OrderAnnotation.class)
public class MethodReferenceTestTwo {

	@Test
	@Order(3)
	void withConstructorTest() {
		//method reference
		Consumer<String> one = Data::new;
		one.accept("value 1");
		
		//lambda
		Consumer<Integer> con = c ->System.out.println(c);
		con.accept(34);
	}
	
	@Test
	@Order(1)
	void withoutRetunTest() {
		Data d = new Data();
		MyInterOne one = d::setData;
		one.access("value 1");
	}
	
	
	@Test
	@Order(2)
	void withReturnTest() {
		MyInterTwo two = Data::getData;
		String s = two.get();
		System.out.println(s);
	}
	
	
}
