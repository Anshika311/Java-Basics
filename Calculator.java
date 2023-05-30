package com.DIVA;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) { 
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Enter operator: ");
		char op =sc.next().charAt(0);
		int r =0;{
			switch(op) {
			case '+': r=a+b;
			System.out.println(a +"+" +b + "=" +r);
			break;
			
			case '-':r=a-b;
			System.out.println(a +"-" +b + "=" +r);
			break;
			
			case '*':r=a*b;
			System.out.println(a +"*" +b + "=" +r);
			break;
			
			case '/':r=a/b;
			System.out.println(a +"/" +b + "=" +r);
			break;
			
			case '%':r=a%b;
			
			System.out.println(a +"%" +b + "=" +r);
			break;
			
			default:System.out.println("Invalid");
			
			}
			
		}
	}
}


