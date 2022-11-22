package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String args[]) {
		
		int number1=0,number2=1,number3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int numberTime = scan.nextInt();
		
		System.out.println("The series is below:");
		
		System.out.print(number1+" "+number2+" ");
		
		for(int i =2; i<=numberTime; i++) {
			
			number3 = number1+number2;
			
			System.out.print(number3+" ");
			
			number1 = number2;
			
			number2 = number3;
		   	
		}
		scan.close();
	}
}
