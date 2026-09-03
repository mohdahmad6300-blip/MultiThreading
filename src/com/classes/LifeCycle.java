package com.classes;

public class LifeCycle extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running..");
	
	try
	{
		Thread.sleep(1000);
	}
	catch (Exception e) {
		System.out.println("Exception Occured..");
	}
	}
	
	
}
