package com.violation.test;

import com.violation.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator t1 = new TaxCalculator();
		t1.CalculateTax(100,10 );
		
		TaxCalculator t2 = new TaxCalculator();
		t2.CalculateTax(2000, 0);
		
		
	}

}

