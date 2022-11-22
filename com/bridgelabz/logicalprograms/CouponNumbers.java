package com.bridgelabz.logicalprograms;

import java.util.*;

class RandomOne{
	
	public int random() {
		Random ran = new Random();
		
		int check = ran.nextInt(1500);
		
		return check;
		
	}
}

public class CouponNumbers {
  
	public static void main(String args[]) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of coupons to generate: ");
		
		int number = scan.nextInt();
		
		int coupon[] = new int[number];
		
		for(int i=0; i<number; i++) {
		
		RandomOne num = new RandomOne();
		
		int result = num.random();
		
		for(int j=0; j<coupon.length; j++) {
			
			if(result == coupon[j]) {}
			
			else {
				coupon[i] = result;
			}
		}
		
		}
		 
		for(int i=0; i<coupon.length; i++) {
			
			System.out.print(coupon[i]+" ");
		}
	
	 scan.close();

	}
}