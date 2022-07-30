package com.assignment;

import java.util.Scanner;

public class Pro_3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter year : ");
		
		year=sc.nextInt();
		
		if(year % 4==0)
		{
			System.out.println("Year is an leap year...");
		}
		else
		{
			System.out.println("Year is not an leap Year...");
		}
		
	}

}
