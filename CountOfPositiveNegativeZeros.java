package com.DIVA;

import java.util.Scanner;

public class CountOfPositiveNegativeZeros {

	public static void main(String[] args) {
		int n , countP=0 , countN=0,  countZ=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 10 Numbers: ");
		for(int i=0; i<10;i++) {
	//	System.out.println("Enter numbers");
		n= sc.nextInt();
		if(n>0) 
			countP++;
		else if(n<0)
			countN++;
		else 
			countZ++;
		}
		System.out.println("Count of Positive Numbers="+ countP);
		System.out.println("Count of Negative Numbers="+ countN);
		System.out.println("Count of Zeros Numbers="+ countZ);
		
		

	}

}
