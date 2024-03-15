/* 3)Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as 
input and performs the operation using switch-case. */


package com.cdac;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Options -  ");
		System.out.println("1. Addition ");
		System.out.println("2. Subtraction ");
		System.out.println("3. Multiplication ");
		System.out.println("4. Division ");
		System.out.print("Enter Your Choice: ");
		
		int result = 0;
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			result = num1+num2;
			System.out.println("Addition is = " + result);break;
			
		case 2:
			result = num1-num2;
			System.out.println("Subtraction is = " + result);break;
			
		case 3:
			result = num1*num2;
			System.out.println("Multiplication is = " + result);break;
			
		case 4:
			result = num1/num2;
			System.out.println("Division is = " + result);break;
			
		default :
			System.out.println(" Invalid Input! ");break;
			
		}
		
		sc.close();
	}

}
