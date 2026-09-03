package com.classes;

public class MyThread extends Thread
{
	@Override 
	public void run()
	{
		System.out.println("Thread is Running..");
		System.out.println("Child Thread Name : "+Thread.currentThread().getName());
		System.out.println("Thread-ID :"+getId());
	}
}
