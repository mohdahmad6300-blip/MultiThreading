package com.classes.Objects;

import com.classes.MyTask;

public class MyTaskObj 
{

	public static void main(String[] args) 
	{
		MyTask task = new MyTask();
		
		Thread t = new Thread(task);
		
		t.start();
	}

}
