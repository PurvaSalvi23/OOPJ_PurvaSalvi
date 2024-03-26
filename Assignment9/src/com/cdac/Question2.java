/* 2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd. */

package com.cdac;

import java.util.Scanner;

public class Question2 
{
	static void checkNumber(int x){
		if(x%2!=0) throw new ArithmeticException("Number is odd");
		System.out.println("Number is even");
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");

		checkNumber(sc.nextInt());
	}

}
