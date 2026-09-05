package com.classes;

import java.util.Scanner;

public class OddThread extends Thread 
{
	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range of Print Odd Numbers : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			if(i%2 != 0)
			{
				System.out.println("Odd : "+i);
				
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			}
			
		}
		System.out.println("====================Completed===========================");
		System.out.println();
	
	}
}
