package com.model;

public class Consumer  extends Thread {

	
	SharedProducerConsumerResources shared  = new SharedProducerConsumerResources();

	public Consumer(SharedProducerConsumerResources shared) {
		super();
		this.shared = shared;
	}
	public void run()
	{
		for(int i =1;i<=5;i++)
		{
			shared.consume();
			
			try {
				Thread.sleep(1500);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception occured:"+e.getMessage());
			}
		}
	}

}
