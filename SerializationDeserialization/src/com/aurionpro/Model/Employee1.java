package com.aurionpro.Model;

public class Employee1 {
	abstract public class Employee implements IPayable {
		
		public String name;
		public int id;
		public double baseSalary;
		
		
		public Employee(String name, int id, double baseSalary) {
			this.name = name;
			this.id = id;
			this.baseSalary = baseSalary;
		}

		
		
		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", baseSalary=" + baseSalary + "]";
		}


		@Override
		public double calculateSalary(double d) {
			return 0.0;
		}

	}

	public double calculateSalary(double d) {
		// TODO Auto-generated method stub
		return 0;
	}


}
