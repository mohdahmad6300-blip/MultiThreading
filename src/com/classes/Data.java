package com.classes;

public class Data 
{
	private int value;
	private boolean available = false;
	
	//producer calls this method 
	public synchronized void produce(int value)
	{
		try
		{
			//What if previous value has not been Consumed.
			while(available)
			{
				wait();
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.value = value;
		available = true;
		
		System.out.println("Produced : "+value);
		
		//Tell Consumer That Data is available.
		notify();
	}
	
	public synchronized int consume()
	{
		try
		{
			while(!available)
			{
				//What is no data is available.
				wait();
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int value = this.value;
		available = false;
		
		System.out.println("Consumed : "+value);
		System.out.println("===================");
		
		//Tell The Producer That The Value Has not been Consumed.
		notify();
		
		return value;
	}
}
