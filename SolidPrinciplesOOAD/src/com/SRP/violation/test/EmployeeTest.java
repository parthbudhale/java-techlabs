package com.SRP.violation.test;

import com.SRP.violation.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Parth");
		e.setSalary(4000);
		e.calculateBonus();
		e.addtodatabase();
	}

}
