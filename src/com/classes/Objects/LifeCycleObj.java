package com.classes.Objects;

import com.classes.LifeCycle;

public class LifeCycleObj 
{

	public static void main(String[] args) 
	{
		LifeCycle lc = new LifeCycle();
		
		System.out.println("Before Start : "+lc.isAlive());
		
		lc.start();
		
		System.out.println("After Start : "+lc.isAlive());
		
		try
		{
			lc.join();
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occured..");
		}
		
		System.out.println("After Completion : "+lc.isAlive());
	}

}


