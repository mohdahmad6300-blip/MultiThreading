package com.classes;

import java.util.Scanner;

public class EvenThread extends Thread 
{
	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range of Print Even Numbers : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			if(i%2 == 0)
			{
				System.out.println("Even : "+i);
				
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
