package com.DIVA;

//import java.util.Scanner;

public class Practicepattern {

	public static void main(String[] args) {
		//HOLLOW RHOMBUS
		/*Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop-. spaces
			for(int j =1; j<=n-i; j++) {
			
				System.out.print(" ");
			}
			if(i==1 || i==n)
			for(int j=1; j<=n;j++) {
				System.out.print("*");
			}
			else
				for(int j=1;j<=n;j++) {
					if(j==1 || j==n)
					System.out.print("*");
					else
						System.out.print(" ");
				}
			
		System.out.println( );*/
		
			
		
		
		//REPEATED NUMBER TRIANGLE
		/*Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop-. spaces
			for(int j =1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();*/
			
			//Palindromic Pattern( same thing from front and back) like BOB, 121
			int n=5;
			for(int i=1; i<=n;i++) {
				//spaces
				for(int j=1; j<=n-i; j++) {
					System.out.print(" ");
				
			}
				//1st half numbers
				for(int j=i; j>=1;j--) {
					System.out.print(j);
				}
				//2nd half numbers
				for(int j=2; j<=i; j++) {
					System.out.print(j);
					
				}
				System.out.println( );
		
		}
	}


		
	
	}



