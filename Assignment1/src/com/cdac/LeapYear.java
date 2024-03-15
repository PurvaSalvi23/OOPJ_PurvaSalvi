/* 2)Write a program that checks if a given year is a leap year or not using both if-else and 
switch-case */

package com.cdac;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int flag = 0;
		
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		
		if(year%100==0)
		{
			flag=1;
		}
		else flag=0;
		
		switch(flag)
		{
		case 0: 
			if(year%4==0)
			{
				System.out.println(year + " is a Leap Year. ");
			}
			else
			{
				System.out.println(year + " is not a Leap Year. ");
			}
			break;
			
		case 1:
			if(year%400==0)
			{
				System.out.println(year + " is a Leap Year. ");
			}
			else
			{
				System.out.println(year + " is not a Leap Year. ");
			}
			break;
			
			default : System.out.println(" Invalid Input! ");
		}
		
		sc.close();
	}

}
