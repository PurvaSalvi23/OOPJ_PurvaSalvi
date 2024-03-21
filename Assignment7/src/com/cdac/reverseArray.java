/* Q4)  Write a program to reverse an Array in java  */

package com.cdac;

public class reverseArray {
	public static void main(String args[])
	{
			int [] arr = new int [] {1, 2, 3, 4, 5};  
		    System.out.print("Original array: ");  
		    for (int i = 0; i < arr.length; i++)
		    {  
		         System.out.print(arr[i] + " ");  
		     }  
		        
		    System.out.println();  
		    System.out.print("Array in reverse order: ");  
		    //Loop through the array in reverse order  
		    for (int i = arr.length-1; i >= 0; i--)
		    {  
		         System.out.print(arr[i] + " ");  
		    }  
	}  
		
}

