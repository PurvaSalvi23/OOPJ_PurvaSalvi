/* Q1. Write a program to print elements of Array ?  */

package com.cdac;

public class printArray 
{	public static void main(String args[])
	{
		int[] arr = new int[] {1,2,3,4,5};
		System.out.print("Elements of array are: ");
		//loop through the array to increment value of i
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
