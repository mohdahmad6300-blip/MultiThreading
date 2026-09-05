package com.classes;

public class Loop extends Thread
{
	public void run()
	{
		int i;
		for(i=1; i<=10; i++)
		{
			System.out.print(i+" ");
		
		try
		{
			Thread.sleep(500);
		}
		catch (Exception e) 
		{
			System.out.println("Thread Interrupted");
		}
	}
}
}