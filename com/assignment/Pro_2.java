package com.assignment;

import java.util.Scanner;

public class Pro_2 
{
	public static void main(String[] args)
	{
		int i =0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter one Character :");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			i++;
		}
		if(i==1) 
			System.out.println("Enter charater "+ch+" is Vowel");
			else
				if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
					System.out.println("Entered charcter "+ch+" is Consonent");
				else
					System.out.println("Not an alphabet");
		}
	


}
