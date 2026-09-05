package com.classes;

public class ThreadTwo extends Thread
{
	private ThreadOne t1;
	
	public ThreadTwo(ThreadOne t1)
	{
		this.t1 = t1;
	}
	
	public void run()
	{
		try
		{
			System.out.println("Thread 2 Started ..");
			
			t1.join();
			
			System.out.println("Thread 2 Resumed ..");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
