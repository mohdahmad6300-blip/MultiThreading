package com.classes;

public class ThreadOne extends Thread
{
	public void run() 
	{
		try
		{
			System.out.println("Thread 1 Started...");
			
			Thread.sleep(2000);
			
			System.out.println("Thread 1 Finished...");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
