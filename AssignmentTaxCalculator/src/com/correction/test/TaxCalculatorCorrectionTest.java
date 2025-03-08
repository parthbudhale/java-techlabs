package com.correction.test;

import com.correction.model.DBLogger;
import com.correction.model.FileLogger;
import com.correction.model.TaxCalculator;

public class TaxCalculatorCorrectionTest {
	public static void main(String[] args) {
		TaxCalculator t1 = new TaxCalculator(new DBLogger());
		t1.CalculateTax(9000, 0);
		TaxCalculator t2 = new TaxCalculator(new FileLogger());
		t2.CalculateTax(2500, 80);
	}

}
