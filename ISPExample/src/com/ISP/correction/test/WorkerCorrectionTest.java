package com.ISP.correction.test;

import com.ISP.correction.model.Labour;
import com.ISP.correction.model.Robot;

public class WorkerCorrectionTest {
	public static void main(String[] args) {
		Labour l = new Labour();
		l.eat();
		l.startWork();
		l.stopWork();
		l.rest();
		System.out.println();
		Robot r = new Robot();
		
		r.startWork();
		r.stopWork();
	}
	}


