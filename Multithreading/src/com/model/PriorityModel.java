package com.model;

public class PriorityModel extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"priority"+ Thread.currentThread().getPriority());
	}
}
