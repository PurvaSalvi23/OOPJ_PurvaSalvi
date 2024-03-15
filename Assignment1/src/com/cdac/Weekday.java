/* 4)Write a program that takes a number representing a weekday (1-7) and prints the name of the 
weekday using switch-case. */

package com.cdac;

import java.util.Scanner;

public class Weekday {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 to 7 representing day of the week: ");
		int number = sc.nextInt();
		
		switch(number) {
		case 1:
			System.out.println("Monday"); break;
			
		case 2:
			System.out.println("Tuesday"); break;
			
		case 3:
			System.out.println("Wedday"); break;
			
		case 4:
			System.out.println("Thurday"); break;
			
		case 5:
			System.out.println("Friday"); break;
			
		case 6:
			System.out.println("Saturday"); break;
			
		case 7:
			System.out.println("Sunday"); break;
			
		default:
			System.out.println(" Invalid Input! "); break;
		}
		
		sc.close();
		
	}

}
