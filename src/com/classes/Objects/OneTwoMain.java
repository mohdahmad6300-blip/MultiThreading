package com.classes.Objects;

import com.classes.ThreadOne;
import com.classes.ThreadTwo;

public class OneTwoMain 
{

	public static void main(String[] args) 
	{
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo(t1);
		
		t1.start();
		t2.start();
		
		try
		{
			Thread.sleep(1000);
			
			System.out.println("Thread 2 State : "+t2.getState());
			
			t1.join();
			t2.join();
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread 2 Final State : "+t2.getState());

	}

}
