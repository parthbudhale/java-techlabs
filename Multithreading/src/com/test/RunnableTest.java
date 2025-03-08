package com.test;

import com.model.RunnableThread;

public class RunnableTest {
	public static void main(String[] args) {
		RunnableThread thread1 = new RunnableThread();
		Thread t1 = new Thread(thread1);
		t1.start();
		
//		RunnableThread thread2 = new RunnableThread();
//		Thread t2 = new Thread(thread2);
//		t2.start();
//		
//		
//		Thread t3 = new Thread(new RunnableThread());
//		t3.start();
	}

}
