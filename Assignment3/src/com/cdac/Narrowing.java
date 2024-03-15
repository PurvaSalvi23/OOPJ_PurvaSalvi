/* 2) Create a program that demonstrates narrowing conversion from double to int and prints the result.*/

package com.cdac;

public class Narrowing {
	public static void main(String args[]) {
		double d = 5.50;
		int i = (int) d;
		System.out.println(i);
	}

}
