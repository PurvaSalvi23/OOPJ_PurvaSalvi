/* 1)Write a program that takes a numerical grade as input and outputs the corresponding letter 
grade using if-else statements.*/

package com.cdac;


import java.util.Scanner;

public class Grade {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();
		
		if(marks>=75)
		{
			System.out.println("A+");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("A");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("B");
		}
		else if(marks>=40 && marks<50)
		{
			System.out.println("C");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		sc.close();
	}

}
