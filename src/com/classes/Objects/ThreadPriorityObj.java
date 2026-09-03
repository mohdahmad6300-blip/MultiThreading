package com.classes.Objects;

import com.classes.ThreadPriority;

public class ThreadPriorityObj 
{
	public static void main(String[] args) 
	{
		ThreadPriority low = new ThreadPriority("Motorola");
		ThreadPriority mid = new ThreadPriority("Samsung");
		ThreadPriority high = new ThreadPriority("Apple");
		
		low.setPriority(Thread.MIN_PRIORITY);      
	    mid.setPriority(Thread.NORM_PRIORITY);   
	    high.setPriority(Thread.MAX_PRIORITY);     
	    
	    low.start();
	    mid.start();
	    high.start();
	}

	
}

