package com.aurionpro.Model;


	public class PartTimeEmployee extends Employee1{

		double hours;
		public PartTimeEmployee(String name, int id, double baseSalary,double hours) {
			super();
			this.hours=hours;
		}
		
		public double calculateSalary(double d) {
			double baseSalary = 0;
			return d*baseSalary;
		}

	}

	
