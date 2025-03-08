package com.correction.test;

import com.correction.model.Duck;
import com.correction.model.Ostrich;
import com.correction.model.Pigeon;
import com.correction.model.Sparrow;

public class BirdCorrectionMain {

	public static void main(String[] args) {
		Sparrow sp = new Sparrow();
		Pigeon p = new Pigeon();
		Ostrich os = new Ostrich();
		Duck d = new Duck();
		
		sp.bodyColor();
		sp.Fly();
		System.out.println();
		p.Fly();
		p.bodyColor();
		System.out.println();
		os.bodyColor();
		os.Walk();
		System.out.println();
		d.bodyColor();
		d.Walk();
		d.Swim();

	}

}