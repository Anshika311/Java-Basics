package com.DIVA;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		 int n= sc.nextInt() ;
		
		for(int i=1; i<=n;i++)
		{
			if(i%2==0) {
				System.out.println("number is =" +i);
			}
		}
	}
}


