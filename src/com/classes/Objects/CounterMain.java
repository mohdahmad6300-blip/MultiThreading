package com.classes.Objects;
import com.classes.CountThread;
import com.classes.Counter;

public class CounterMain 
{
   public static void main(String[] args) 
	{
		Counter counter = new Counter();
		
		CountThread ct1 = new CountThread(counter);
		CountThread ct2 = new CountThread(counter);
		
		ct1.start();
		ct2.start();
		
		try
		{
			ct1.join();
			ct2.join();
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Final Value : "+counter.count);

	}

}
