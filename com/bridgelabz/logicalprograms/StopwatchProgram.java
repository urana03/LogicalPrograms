package com.bridgelabz.logicalprograms;
import java.util.*;

public class StopwatchProgram {
	
	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		long start,stop;
		double time;
		
		System.out.print("Enter a character to start: ");
		char st = scan.nextLine().charAt(0);
		start = System.currentTimeMillis();
		System.out.print("Enter a character to stop: ");
		char so = scan.nextLine().charAt(0);
		stop = System.currentTimeMillis();
		
		time = (stop-start)/1000;
		System.out.print("The elapsed time: "+time);
		scan.close();
	}
}