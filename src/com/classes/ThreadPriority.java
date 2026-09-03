package com.classes;

public class ThreadPriority extends Thread
{
	public ThreadPriority(String name)
	{
		super(name);
	}
	
	public void run()
	{
		System.out.println("Thread name : "+getName()+" || Priority : "+getPriority());
	}
}
