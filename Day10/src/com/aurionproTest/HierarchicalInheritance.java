package com.aurionproTest;

import com.aurionpromodel.Employee;
import com.aurionpromodel.Manager;

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Manager m =new Manager();
		m.display();
		m.displayManager();
		Employee emp = new Employee();
		emp.display();
		emp.displayEmploye();
		
		
	}

}
