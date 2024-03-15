/* 4) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string) and 
prints the result */

package com.cdac;

public class WideningConversion {
	public static void main(String args[]) {
		int i = 10;
		String str = Integer.toString(i);
		float f = i;
		double d = i;
		// boolean bool = i; cannot convert any datatype to boolean and vice versa
		
		System.out.println(str);
		System.out.println(f);
		System.out.println(d);
	}
}
