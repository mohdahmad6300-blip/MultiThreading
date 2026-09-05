package com.classes;

public class CurrentThread extends Thread 
{
	public void run()
	{
		Thread current = Thread.currentThread();
		
		System.out.println("Thread Name     : "+current.getName());
		System.out.println("Thread Priority : "+current.getPriority());
		System.out.println("Thread ID       : "+current.threadId());
		System.out.println("=========================================");
	}
}
