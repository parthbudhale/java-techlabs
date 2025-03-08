package com.SRP.correction.test;

import com.SRP.correction.model.Employe;
import com.SRP.correction.model.EmployeeAddToDatabase;
import com.SRP.correction.model.EmployeeCalculateBonus;

public class EmployeeMain {
	public static void main(String[] args) {
		Employe e = new Employe();
		e.setName("Parth");
		e.setSalary(50000);
		
		EmployeeCalculateBonus ec = new EmployeeCalculateBonus();
		ec.calculateBonus(e);
		
		EmployeeAddToDatabase ed = new EmployeeAddToDatabase();
		ed.addToDatabase(e);
	}

}
