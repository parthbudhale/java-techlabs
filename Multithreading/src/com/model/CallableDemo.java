package com.model;

import java.util.concurrent.Callable;

public class CallableDemo  implements Callable <String>{
	public String taskname;
	
	

	public CallableDemo(String taskname) {
		super();
		this.taskname = taskname;
	}



	@Override
	public String call() throws Exception {
		Thread.sleep(1500);
		return "task " + " is completed";
	}
	

}
