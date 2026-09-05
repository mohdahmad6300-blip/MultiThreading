package com.classes;

public class Consumer extends Thread
{
	private Data data;
	
	public Consumer(Data data)
	{
		this.data = data;
	}
	
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			data.consume();
		}
	}
}
