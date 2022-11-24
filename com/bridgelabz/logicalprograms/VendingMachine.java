package com.bridgelabz.logicalprograms;

import java.util.*;

public class VendingMachine {

	public static void main(String args[]) {
	
	  Scanner scan = new Scanner(System.in);
	  System.out.print("Enter amount to get the change: ");
	  int change = scan.nextInt();
		
	  int notes[] = {1,2,5,10,50,100,500,1000};
	  int len = notes.length;
	  int count = 0;
	
	  for (int i = len-1; i>=0; i--) {
		
		    while(change>=notes[i]) {
			   change -= notes[i];
			   System.out.print(notes[i]+"\n");
			   count++;
		}
	}
	System.out.println("Number of changes:"+count);
 
	}
}