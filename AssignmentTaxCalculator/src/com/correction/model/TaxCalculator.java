package com.correction.model;

public class TaxCalculator {

	private ILogger logger;

	public TaxCalculator(ILogger logger) {
		super();
		this.logger = logger;
	}

	public ILogger getLogger() {
		return logger;
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
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
