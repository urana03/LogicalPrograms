package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String args[]) {
	
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		long number = scan.nextLong();
		
		for(int i=1; i<number; i++) {
			
			if(number%i == 0) {
				
				sum = sum+i;
			}
		}
		
		if(number == sum) {
			
			System.out.println("The given number is a perfect number");
			
		}
		else {
			
			System.out.println("The given number is not a perfect number");
			
		}
		scan.close();
	}
}
