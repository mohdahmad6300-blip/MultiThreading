package com.classes.Objects;

import com.classes.EvenThread;
import com.classes.OddThread;

public class EvenOddMain 
{

	public static void main(String[] args) throws Exception
	{
		EvenThread even = new EvenThread();
		
		even.start();
		even.join();
		
		OddThread odd = new OddThread();
		
		odd.start();

	}

}
