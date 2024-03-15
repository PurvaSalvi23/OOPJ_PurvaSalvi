/* 5)Write a program that takes a character as input and determines whether it’s a vowel or a 
consonant using if-else. */

package com.cdac;

import java.util.Scanner;

public class Vowel {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch == 'a' || ch == 'a' || ch == 'a' || ch == 'a' || ch == 'a' )
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		sc.close();
	}

}
