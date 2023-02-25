package com.jdc.mkt.singletonDesignPattern;

public class Day {

	private static Day instance;

	private Day() {
	}

	public static Day getInstance() {

		if (null == instance) {
			instance = new Day();
			return instance;
			
		} else {
			return instance;
		}
	}

}
