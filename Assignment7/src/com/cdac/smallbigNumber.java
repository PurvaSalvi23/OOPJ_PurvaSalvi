/* Q5. Find out smallest and largest number in a given Array? */

package com.cdac;

import java.util.Scanner;

public class smallbigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int min=arr[0];
        for(int i=0;i<n ;i++)
        {
        	if(arr[i]<min)
        	{
        		min=arr[i];
        	}
        }
        System.out.println("smallest number : "+min);
        
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>max)
        	{
        		max=arr[i];
        	}
        }
        System.out.println("Largest number : "+max);
	}
}
