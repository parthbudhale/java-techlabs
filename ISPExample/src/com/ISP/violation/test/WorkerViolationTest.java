package com.ISP.violation.test;

import com.ISP.violation.model.Labour;
import com.ISP.violation.model.Robot;

public class WorkerViolationTest {
	public static void main(String[] args) {
		Labour l = new Labour();
		l.drink();
		l.eat();
		l.startWork();
		l.stopWork();
		System.out.println();
		Robot r = new Robot();
		r.drink();
		r.eat();
		r.startWork();
		r.stopWork();
		System.out.println();
		
	}

}
