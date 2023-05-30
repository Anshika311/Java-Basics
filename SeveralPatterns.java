package com.DIVA;

import java.util.Scanner;

public class SeveralPatterns {

	public static void main(String[] args) {
		//SOLID RHOMBUS
		/*Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop-. spaces
			for(int j =1; j<=n-i; j++) {
			
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
						System.out.print("*");
				}
			
		System.out.println( );*/
	
		//HALF PYRAMID WITH NUMBERS
		
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();{
		//outer loop
		for(int i=1 ; i<=n; i++) {
			// inner loop
			//for(int j=1; j<=i ;j++) {
			for( int j=1; j<=n-i+1; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		

	}


	}
}
