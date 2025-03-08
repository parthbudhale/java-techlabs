package com.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class addTest {
	
//	@BeforeAll
//	static void beforeall()
//	{
//		System.out.println("before testing...check");
//	}
//	
//	@AfterAll
//	static void Afterall()
//	{
//		System.out.println("After testing...check");
//	}
//	
	@BeforeEach
	 static void beforeEach()
	{
		System.out.println("before testing...check");
	}
	
	@AfterEach
	 static void AfterEach()
	{
		System.out.println("After testing...check");
	}
	
	
	
	

	@Test
	void test() {
	Calculator cal = new Calculator();
	double output = cal.add(5.0, 8.0);
	assertEquals(13.0, output);
	}
	
	@Test
	void test1() {
		Calculator cal = new Calculator();
		double output = cal.muliply(5.0, 8.0);
		assertEquals(13.0, output);
	}
	
	@Test
	void test2() {
		Calculator cal = new Calculator();
		double output = cal.sub(5.0, 8.0);
		assertEquals(13.0, output);
	}
	
	@Test
	void test3() {
		Calculator cal = new Calculator();
		double output = cal.div (5.0, 8.0);
		assertEquals(13.0, output);
	}


}
