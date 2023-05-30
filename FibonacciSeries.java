package com.DIVA;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13,21
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a=0, b=1;
		System.out.println(a +" ");
		if(n>1);
		//find nth term
		for(int i=2;i<=n;i++) {
			System.out.println(b+" ");
			//the concept below is called swapping
			int temp=b;
			b= a+b;
			a= temp;
			
		}
		System.out.println();

	}

}
