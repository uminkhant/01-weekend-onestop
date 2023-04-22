package com.jdc.mkt;

import java.io.Serializable;

public class Data implements Serializable {

	private static final long serialVersionUID = 1L;
	private int a;

	void setA(int a) {
		this.a = a;
	}

	int getA() {
		return a;
	}
}
