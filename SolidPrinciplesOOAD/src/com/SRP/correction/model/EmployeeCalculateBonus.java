package com.SRP.correction.model;

public class EmployeeCalculateBonus {
	public double calculateBonus(Employe e)
	{
		double amount = e.getSalary() *0.10;
		System.out.println("Bonus amount is "+amount);
		return amount;
	}


}
