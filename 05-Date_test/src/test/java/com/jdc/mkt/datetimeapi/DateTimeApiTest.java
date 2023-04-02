package com.jdc.mkt.datetimeapi;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class DateTimeApiTest {

	@Test
	@Order(1)
	void currentDateTimeTest() {
		System.out.println("===== test 1 =================");
		var ld = LocalDate.now();
		System.out.println(ld);
		var lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		ldt = LocalDateTime.now();

		System.out.println(ldt);
		System.out.println();
		var instNow = Instant.now();
		System.out.println(instNow);
		var offset = OffsetDateTime.now();
		System.out.println(offset);
		var zone = ZonedDateTime.now();
		System.out.println(zone);

		System.out.println();
	}

	@Test
	@Order(2)
	void createDateTimeTest() {
		System.out.println("===== test 12=================");
		var ld = LocalDate.of(2023, 04, 07);
		System.out.println(ld);
		var lt = LocalTime.of(8, 30);
		System.out.println(lt);
		var ldt = LocalDateTime.of(ld, lt);

		System.out.println(ldt);

		var mechine = ldt.toInstant(ZoneOffset.UTC);
		System.out.println(mechine);

		var human = mechine.atOffset(ZoneOffset.UTC);
		System.out.println(human);
		System.out.println();
	}

	@Test
	@Order(3)
	void accessFieldsTest() {
		System.out.println("===== test 3 =================");
		LocalDateTime ldt = LocalDateTime.now();
		var year = ldt.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(year);
		var time = ldt.get(ChronoField.HOUR_OF_AMPM);
		System.out.println(time);
		System.out.println();
	}

	@Test
	@Order(4)
	void temporalAdjustorTest() {

		System.out.println("===== test 4 =================");
		var ld = LocalDate.now();

		TemporalAdjuster taj = temporal -> LocalDate.of(temporal.get(ChronoField.YEAR),
				temporal.get(ChronoField.MONTH_OF_YEAR), 25);

		System.out.println(taj);
		var temp = ld.with(taj);
		System.out.println(temp);

		var taj2 = TemporalAdjusters.firstDayOfNextYear();
		var temp2 = ld.with(taj2);
		System.out.println(temp2);

		var chronoYear = ld.with(ChronoField.YEAR, 1999);
		System.out.println(chronoYear);

		var fYear = ld.withYear(2020).withMonth(10).withDayOfMonth(22);
		System.out.println(fYear);
		System.out.println();
	}

	@Test
	@Order(5)
	void temporalAmountTest() {
		System.out.println("===== test 5 =================");
		var lt = LocalTime.now();
		var dlt = Duration.ofHours(5);
		var plus1 = lt.plus(dlt);
		var minus1 = lt.minus(dlt);
		System.out.println("Duration  : " + dlt + "\t Plus : " + plus1 + "\t Minus : " + minus1);
		System.out.println();

		var specificV = lt.plus(30, ChronoUnit.MINUTES);
		System.out.println(specificV);

		var ld = LocalDate.now();
		var dld = Period.ofYears(20);
		var plus2 = ld.plus(dld);
		var minus2 = ld.minus(dld);
		System.out.println("Period : " + dld + "\t Plus : " + plus2 + "\tMinus : " + minus2);

		var fluentDay = ld.plusDays(20);

		System.out.println(fluentDay);
		System.out.println();

	}

	@Test
	@Order(6)
	void durationTest() {
		System.out.println("===== test 6 =================");
		var ld1 = LocalDate.now();
		var ld2 = LocalDate.of(2023, 04, 07);
		var p = Period.between(ld2, ld1);
		System.out.println(p);

		var lt1 = LocalTime.now();
		var lt2 = LocalTime.of(22, 30);
		var du = Duration.between(lt1, lt2);
		System.out.println(du);
		System.out.println();
	}
	
	@Test
	@Order(7)
	void datetimeFormatterTest() {
		System.out.println("================== test 7 =============");		
		var now = LocalDate.now();
		System.out.println(now);
		String text1 = now.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(text1);	
		String text2 = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now());
		System.out.println(text2);
		
		String text3 = now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		System.out.println(text3);
		
		String text4  = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss a"));
		System.out.println(text4);
	}
	
	
	
	
	
	
	
	
	
	

}
