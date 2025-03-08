package com.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class div {

	@Test
	void test() {
		Calculator cal = new Calculator();
		double output = cal.div (5.0, 8.0);
		assertEquals(13.0, output);
	}

}
