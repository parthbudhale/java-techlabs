package com.model;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		//System.out.println("thread is running using Runnable Interface");
	 
		 for (int i = 0; i < 10; i++) {
				System.out.println("value of i is: " + i);

				try {
					Thread.sleep(2000);
				} catch (Exception e){
			
		}

	}

}
	}
