package com.Diva;

import java.util.Scanner;

public class Example2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int [][]numbers=new int[rows][cols];
		
		//rows
		//input
		for(int i=0;i<rows;i++) {
			
			//cols
			for(int j=0;j<cols;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		//output
		int x=sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(numbers[i][j]==x) {
				System.out.println("x is found at location (" + i + "," + j + ")");
				}
			}
		}
		

	}

}
