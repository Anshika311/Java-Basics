package com.DIVA;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
				
		//INVERTED HALF PYRAMID ROTATED 180 Degree
		/*Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		//outer loop
		for(int i=1;i<=n;i++) {
			//inner loop->space print
			for(int j=1; j<=n-i ;j++) {
			System.out.print(" ");
		}
			
			//inner loop -> star print
			for(int j=1; j<=i ;j++) {
				System.out.print("*");
			}
			System.out.println();*/
		
		//PRINT HALF PYRAMID 
		/*Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		//outer loop
		for(int i=n; i>=1; i--) {
			// inner loop
			//for(int j=1; j<=i ;j++) {
			for( int j=1; j<=n-i+1; j++) {
				System.out.print(j +" ");
			}
			System.out.println();*/
		
		
		// FLOYD'S TRIANGLE
		/*Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int number = 1;
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			for(int j=1; j<=i; j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();*/
		
		
		//0 1 TRIANGLE
		/*Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		//outer loop
		for(int i=1; i<=n; i++) {
			//inner loop
			for(int j =1; j<=i; j++) {
				int sum =i+j;
				if(sum%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();*/
		
		}
		
			

	}
	


