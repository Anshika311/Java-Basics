package com.DIVA;

import java.util.Scanner;

public class CircumferenceOfCircle {
	public static double calculateCircumference(double r) {
		double circumference = 2* 3.14 * r;
		return 2* 3.14 *r;
	}

	public static void main(String[] args) {
		System.out.println("Enter Radius");
		Scanner sc=new Scanner(System.in);
		double r = sc.nextFloat();
		//double c=  2 * 3.14 * r;{
		System.out.println(calculateCircumference(r));
		}
		
	}

		
		

	
