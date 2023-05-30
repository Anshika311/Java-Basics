package com.DIVA;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		System.out.println("Enter number");
		
		Scanner sc = new Scanner(System.in);
		int Button = sc.nextInt();
		
		/*if(Button==1) {
			System.out.println("Hello");
		}
		else if(Button==2) {
			System.out.println("Namaste");
		}  
		else if(Button==3) {
			System.out.println("Bonjour");
		}
		else {
			System.out.println("Invalid");
		}*/
		
		switch(Button) {
		case 1: System.out.println("Hello");
		break;
		case 2: System.out.println("Namaste");
		break;
		case 3:System.out.println("Bonjour");
		break;
		default:
			System.out.println("Invalid");
		}
		
		}
		

	}


