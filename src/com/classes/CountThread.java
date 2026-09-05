package com.classes;
import com.classes.Counter;

public class CountThread extends Thread
{
	Counter counter;
	
	public CountThread(Counter counter) 
	{
		this.counter = counter;
	}
	
	public void run()
	{
		for(int i = 1; i <= 1000; i++)
		{
			counter.increment();
		}
	}
	
}
