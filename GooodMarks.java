package com.DIVA;

import java.util.Scanner;

public class GooodMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int input;
	
		do {
			int marks= sc.nextInt();
			if(marks >= 90 && marks <= 100) {
			System.out.println("This is good");
			}else if(marks >= 60 && marks <= 89) {
				System.out.println("This is also good");
			}else if(marks >= 0 && marks <= 59) {
				System.out.println("This is also good as well");
			}else {
				System.out.println("Invalid");
			}
			System.out.println("Want to continue? (yes(1) or no(0))");
			input =sc.nextInt();
			System.out.println("Stop");
		}
		while(input==1);
	}
}
			
		
		
		

	


