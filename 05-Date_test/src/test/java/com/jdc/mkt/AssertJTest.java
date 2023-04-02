package com.jdc.mkt;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class AssertJTest {

	@Test
	void assertTest() {
		
		assertThat(LocalDate.of(2024, 03, 25))
		.isAfter(LocalDate.now());
		assertThat(LocalDate.now()).isBefore(LocalDate.of(2023, 03, 26));
	}
}
