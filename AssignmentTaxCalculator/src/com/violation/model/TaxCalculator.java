package com.violation.model;

public class TaxCalculator {
	private DBLogger logger;

	public TaxCalculator(DBLogger logger) {
		super();
		this.logger = logger;
	}

	public TaxCalculator() {
		super();
	}

	public int CalculateTax(int amount, int rate) {
		int tax = 0;
		try {
			tax = amount / rate;
			System.out.println(tax);
			return tax;
		} catch (Exception e) {
			new DBLogger().log("Divide by zero");

		}
		return 0;
	}

}
