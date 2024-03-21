/* 2) Write a Java program to check the equality of two arrays? */

package com.cdac;

public class equalArrays {
	public static void main(String args[])
	{
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {1,2,3,4,5};
		
		//comparing references using == operator
		// it works same as a1.equals(a2)
		if(arr1 == arr2)
			System.out.println("Array's are equal. ");
		else 
			System.out.println("Array's are not equal. ");
	}
}
