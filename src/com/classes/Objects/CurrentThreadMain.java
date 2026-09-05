package com.classes.Objects;

import com.classes.CurrentThread;

public class CurrentThreadMain 
{

	public static void main(String[] args) throws InterruptedException 
	{
		CurrentThread t = new CurrentThread();
		
		t.setName("Ahmad's-Thread");
		t.setPriority(Thread.MAX_PRIORITY);
		
		t.start();
		t.join();
		CurrentThread t2 = new CurrentThread();
		
		t2.setName("Rizwan's-Thread");
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t2.start();
		t2.join();
		
		CurrentThread t3 = new CurrentThread();
		
		t3.setName("Aboozar's-Thread");
		t3.setPriority(Thread.NORM_PRIORITY);
        t3.start(); 
		
	}

}
