package com.violation.test;

import com.violation.model.Ostrich;
import com.violation.model.Pigeon;
import com.violation.model.Sparrow;

public class BirdsViolationMain {
	public static void main(String[] args) {
		Sparrow sp = new Sparrow();
		sp.fly();
		Pigeon pg = new Pigeon();
		pg.fly();
		Ostrich os = new Ostrich();
		os.fly();
	}

}
	


