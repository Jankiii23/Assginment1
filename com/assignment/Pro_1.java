package com.assignment;

import java.util.Scanner;

public class Pro_1 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter First Number :");
		a=sc.nextInt();
		System.out.println("Enter Second Number :");
		b=sc.nextInt();
		System.out.println("Enter Third Number :");
		c=sc.nextInt();
		
	
	if(a<b)
		
		{
			if(a>c)
			{
				System.out.println("A is max...");
			}	
			else
			{
				System.out.println("C is max");
			}
		}
		else
		{
			if(b>c) 
			{
				System.out.println("B is Max...");
				
			}
			else
			{
				System.out.println("C is Max...");
			}
		}
		
	}

}
