package com.classes.Objects;

import com.classes.SleepState;

public class SleepMain 
{

	public static void main(String[] args)
	{
		SleepState sp = new SleepState();

		sp.start();
		
		try {
			Thread.sleep(1000);

		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread State : "+sp.getState());
		
		try {
			sp.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread State : "+sp.getState());
	}

}
