package com.DIVA;

import java.util.Scanner;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%2!=0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
}
			
		
