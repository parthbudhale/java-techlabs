package com.aurionpro.Model;

import com.aurionpro.Model.Employee1.Employee;

public class FullTimeEmployee extends Employee1{

		double bonus;
		public FullTimeEmployee(String name, int id, double baseSalary,double bonus) {
			super();
			this.bonus=bonus;
		}
		
		@Override
		public double calculateSalary(double d) {
			return baseSalary+bonus;
		}

	}

