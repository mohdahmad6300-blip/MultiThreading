package com.classes;

public class Lop2 extends Thread
{
	public void run()
	{
		int i;
		for(i=11; i<=20; i++)
		{
			System.out.print(i+" ");
		
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e) 
		{
			System.out.println("Thread Interrupted");
		}
	}
}
}
