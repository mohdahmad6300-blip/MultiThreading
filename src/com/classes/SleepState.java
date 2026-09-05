package com.classes;

public class SleepState extends Thread

{
	public void run()
	{
		try
		{
			System.out.println("Thread is Going To Sleep ...");
			
			Thread.sleep(2000);
			
			System.out.println("Thread Finished Sleeping ...");
		}
		catch (InterruptedException e) 
		{
			System.out.println("\nThread was Interrupted\n");
		}
	}
	
}
