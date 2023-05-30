package com.DIVA;

//import java.util.Scanner;

public class MorePattern {

	public static void main(String[] args) {
		//HALF PYRAMID and INVERTED HALF PYRAMID
		int n =4;
		//Scanner sc= new Scanner(System.in);
		//int n= sc.nextInt();
		//outer loop
		//for(int i=1; i<=n; i++) {
			
		for(int i=n; i>=1; i--) {
			
			//inner loop
			for(int j=i; j<=1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
