package com.model;

public class MultiThreadModel extends Thread {

	public String threadname;
	public int sleepTime;

	public MultiThreadModel(String threadname, int sleepTime) {

		this.threadname = threadname;
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(threadname + " is working on...iteration no:" + 1);
			}
			Thread.sleep(sleepTime);
			System.out.println(threadname + " is working on...iteration for " + sleepTime + "ms");
		}
		
		catch (InterruptedException e) {
			System.out.println(threadname + "was interrupted");
		}
	}

}
