package com.cdac;

import java.util.Scanner;

public class BMI {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter your weight in kgs: ");
		float weight = sc.nextFloat();
		
		System.out.print("Enter your height in mtr: ");
		float height = sc.nextFloat();
		
		float bmi = weight/(height*height);
		if(bmi>= 30.0)
		{
			System.out.println("Your BMI = Overweight");
		}
		else if(bmi>18.5 && bmi<24.9)
		{
			System.out.println("Your BMI = Normal weight");
		}
		else
			System.out.println("Your BMI = Underweight");
		
		sc.close();
			
	}

}
