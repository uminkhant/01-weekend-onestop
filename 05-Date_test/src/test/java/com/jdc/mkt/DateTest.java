package com.jdc.mkt;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class DateTest {

	// @Test
	void dateTest() throws ParseException {

		Long ld = 21423421341324L;
		Date d = new Date(ld);
		System.out.println(d);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = df.parse("23/02/2015");
		System.out.println(d1);

		Calendar cl = Calendar.getInstance();
		cl.set(2013, 02, 11);
		System.out.println(cl.getTime());

	}

//	@Test
	void calenderFieldsTest() {

		Calendar cl1 = Calendar.getInstance();
		cl1.setLenient(true);
		cl1.set(Calendar.DAY_OF_WEEK, 7);
		System.out.println(cl1.getTime());

		Calendar cl2 = Calendar.getInstance();
		cl2.setLenient(true);
		cl2.set(Calendar.DAY_OF_MONTH, 32);
		System.out.println(cl2.getTime());

		Calendar cl3 = Calendar.getInstance();
		cl3.setLenient(false);
		cl3.set(Calendar.DAY_OF_YEAR, 340);
		System.out.println(cl3.getTime());

		Calendar cl4 = Calendar.getInstance();
		cl4.set(Calendar.MONTH, 13);
		System.out.println(cl4.getTime());

	}

//	@Test
	void addAndRollTest() throws ParseException {

		Date d = new SimpleDateFormat("dd/MM/yyyy").parse("02/03/2022");
		Calendar cl = Calendar.getInstance();
		cl.setTime(d);

		cl.add(Calendar.MONTH, 13);
		cl.roll(Calendar.MONTH, 13);
		System.out.println(cl.getTime());
	}

	@Test
	void dateTimePatternTest() throws ParseException {

		DateFormat df = new SimpleDateFormat("dd:MM:yyyy  HH:mm:ss ");
//		Date d = df.parse("02:03:2012 02:30:22");
//		System.out.println(d);

		Date d1 = new Date();
		String s = df.format(d1);
		System.out.println(s);
	}

}
