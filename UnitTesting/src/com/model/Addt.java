package com.model;


	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.DisplayName;
	import org.junit.jupiter.api.Test;

	public class Addt {
		@BeforeAll
		static void beforeall()
		{
			System.out.println("Before testing...check");
		}
		
		@AfterAll
		static void afterall()
		{
			System.out.println("After testing...check");
		}
		
		@BeforeEach
		void beforeaech()
		{
			System.out.println("Before each method testing...");
		}
		
		@AfterEach
		void aftereach()
		{
			System.out.println("After each method testing...");
		}
		
		

		@Test
		@DisplayName("Addition")
		void test() {
			Calculator c = new Calculator();
			double output = c.add(12, 50);
			assertEquals(62, output);
		}

		@Test
		@DisplayName("Multiply")
		void test2() {
			Calculator c = new Calculator();
			double output = c.muliply(10, 20);
			assertEquals(200, output);
		}
		
		@Test
		@DisplayName("Subtraction")
		void test3() {
			Calculator c = new Calculator();
			double output = c.sub(60, 50);
			assertEquals(10, output);
		}
		
		@Test
		@DisplayName("Division")
		void test4() {
			Calculator c = new Calculator();
			double output = c.div(49, 7);
			assertEquals(7, output);
		}
		
		@Test
		@DisplayName("Mod")
		void test5() {
			Calculator c = new Calculator();
			double output = c.div(45, 5);
			assertEquals(0, output);
		}
	
	}
