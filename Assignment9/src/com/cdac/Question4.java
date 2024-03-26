/* 4. Write a code for arithmetic exception using one try block & 
 multiple catch block & check which catch block handle that exception. */

package com.cdac;

import java.util.Scanner;

public class Question4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		try{
			System.out.print("Enter num1 : ");
			int num1=sc.nextInt();

			System.out.print("Enter num2 : ");
			int num2=sc.nextInt();

			System.out.println(num1/num2);
		}catch(ArithmeticException ae){
			System.out.println("Catching Arithmetic Exception");
			ae.printStackTrace();
		}catch(RuntimeException re){
			System.out.println("Catching Runtime Exception");
			re.printStackTrace();
		}catch(Exception e){
			System.out.println("Catching Exception");
			e.printStackTrace();
		}
		finally{
			sc.close();
		}
	}
}
