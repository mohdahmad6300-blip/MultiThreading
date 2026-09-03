package com.classes.Objects;

import com.classes.Loop;
import com.classes.Lop2;

public class LoopObj 
{

	public static void main(String[] args) 
	{
       Loop l = new Loop();
       Lop2 l2 = new Lop2();
    	   
       l.start();

       try
       {
    	   		l.join();
       }
       catch (Exception e) 
       {
		System.out.println("THread Interrupted..");
	}
       
       l2.start();
       
	}

}
