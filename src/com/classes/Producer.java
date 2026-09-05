package com.classes;

public class Producer extends Thread 
{
	private Data data;
	
	public Producer(Data data)
	{
		this.data = data;
	}
	
	public void run()
	{
		for(int i = 1; i<=5; i++)
		{
			data.produce(i);
		}
	}
}
