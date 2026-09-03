package com.classes.Objects;

import com.classes.MyThread;

public class MyThreadObj 
{

	public static void main(String[] args) 
	{
		System.out.println("Main Thread Name : "+Thread.currentThread().getName());
		MyThread mt = new MyThread();
		
		mt.setName("Ahmad's-Thread");
		
		mt.start();
		

	}

}
