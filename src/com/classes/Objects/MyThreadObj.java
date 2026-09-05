package com.classes.Objects;

import com.classes.MyThread;

public class MyThreadObj 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Main Thread Name : "+Thread.currentThread().getName());
		MyThread mt = new MyThread();
		
		System.out.println("Before Start : "+mt.getState());
		
		mt.setName("Ahmad's-Thread");
		
		mt.start();
		
		System.out.println("After Start : "+mt.getState());
		mt.join();
		
		
		System.out.println("After Complete : "+mt.getState());

	}

}
