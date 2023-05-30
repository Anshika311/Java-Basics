package com.DIVA;

import java.util.Scanner;

public class ExtraPatterns {

	public static void main(String[] args) {
		// HOLLOW BUTTERFLY PATTERN
		Scanner sc =new Scanner(System.in);
		//int n= sc.nextInt();
		//int m= sc.nextInt();
		int n=5;
		
				
		//upper half
		for(int i=1; i<=n; i++) {
			System.out.print("*");
			//1st part
			for(int j=1; j<=i-2; j++) {
					System.out.print(" ");
				}
			if(i>1) {
				System.out.print("*");
			}
			//spaces
			int spaces= 2 * (n-i);
			for(int j=1; j<=spaces;j++) {
            

			System.out.print(" ");
		}
			System.out.print("*");
			//2nd part
			for(int j=1; j<=i-2;j++) {
					
					System.out.print(" ");
					
				}
			if(i>1){
					System.out.print("*");
				}

			System.out.println(" ");
				
	}
		//lower half
		for(int i=n; i>=1; i--) {
				System.out.print("*");
				//1st part
				for(int j=1; j<=i-2; j++) {
						System.out.print(" ");
					}
				if(i>1) {
					System.out.print("*");
				}
				//spaces
				int spaces= 2 * (n-i);
				for(int j=1; j<=spaces;j++) {
	            

				System.out.print(" ");
			}
				System.out.print("*");
				//2nd part
				for(int j=1; j<=i-2;j++) {
						
						System.out.print(" ");
						
					}
				if(i>1){
						System.out.print("*");
					}

				System.out.println(" ");
					}
				
	}
}
		

	


