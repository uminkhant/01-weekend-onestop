package com.jdc.mkt.exercise;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private List<SaleHistory> list;

	Database() {
		if (null == list) {
			list = new ArrayList<>();
		}
	}

	public void addHistory(SaleHistory sh) {
		list.add(sh);
	}
	
	public List<SaleHistory> getSaleHistory(){
		return list;
	}
}
