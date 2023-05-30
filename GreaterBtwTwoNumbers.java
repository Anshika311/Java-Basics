package com.DIVA;

import java.util.Scanner;

public class GreaterBtwTwoNumbers {
	public static void main(String[] args) {
		System.out.println("Enter two numbers a, b");
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b= sc.nextInt();

			if(a>b) {
				System.out.println("a is greater number =" +a);
			}else if(a==b) {
				System.out.println("a and b are equal numbers");
			}else {
				System.out.println("b is greater number=" +b);
			}
	}
}
