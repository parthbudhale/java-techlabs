package com.test;

import com.model.PriorityModel;

public class PriorityTest {
	public static void main(String[] args) {
		PriorityModel t1 =new PriorityModel();
		PriorityModel t2 =new PriorityModel();
		PriorityModel t3 =new PriorityModel();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
				
	
}

}
