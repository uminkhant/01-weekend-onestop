package com.jdc.mkt.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(OrderAnnotation.class)
public class HistoryTest {
	
	static Database db;
	
	@BeforeAll
	static void createDb() {
		 db = new Database();
	}

	@Order(1)
	@ParameterizedTest
	@CsvSource(value ={"1:apple:2:1500","2:orange:5:800"}, delimiter = ':')
	void addSaleHistory(int id,String name,int qty,int price) {
	
		SaleHistory sh = new SaleHistory();
		sh.setId(id);
		sh.setItem(name);
		sh.setQty(qty);
		sh.setPrice(price);
		db.addHistory(sh);
	}
	
	@Order(2)
	@Test
	void getHistoryTest() {
		assertEquals(2, db.getSaleHistory().size());
	}
	
}
