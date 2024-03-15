/* 3) Write a program that performs arithmetic operations involving different data types (int, double, float) 
and observes how Java handles widening conversions automatically. */

package com.cdac;

public class CalculatorWideNarrow {
	public static void main(String args[]) {
		int i = 5;
		double d = 10.00;
		long l = 15;
		float f= 15.00f;
		
		double dResult = i+d;
		long lResult = i+l;
		float fResult = i+f;
		
		System.out.println("Double : " + dResult);
		System.out.println("Long : " + lResult);
		System.out.println("Float : " + fResult);
	}
}
