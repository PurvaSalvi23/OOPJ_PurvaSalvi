/* 6) .Print the third-largest number in an array without sorting it 
Input: [ 24,54,31,16,82,45,67]
Output: 54 (82 and 67 are the largest and second-largest) */

package com.cdac;

public class Question6 {
	public static void main(String[] args) {
		int[] arr= {24,54,31,16,82,45,67};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
			}
		}
		System.out.print("Third largest element is: "+arr[arr.length-3]);
	}

}
