package com.model;

public class SharedProducerConsumerResources {
	
	public int data;
	public boolean isProduced =false;
	
	public synchronized void produce(int values)
	{
		while(isProduced)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		data =values;
		isProduced =true;
		System.out.println("Produced :"+values);
		notify();
	}
		
		public synchronized  void consume()
		{
			while(!isProduced)
			{
				try
				{
					wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			
			}
		System.out.println("consumed :"+data);
		isProduced=false;
		notify();
}
}


		

	


