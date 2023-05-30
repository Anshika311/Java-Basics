package firstprogram;

import java.util.Scanner;

public class Firstclass {

	public static void main(String[] args) {
		
		
		        //print star
				//System.out.println("*\n**\n***");
				/*System.out.println("*");
				System.out.println("**");
				System.out.println("***");
				System.out.println("****");*/
				
				
				//1.print age by user
				/*System.out.println("Enter the Age\n");
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				sc.close();
				System.out.println(a);*/
				
				
				//2.calculate radius and area
				/*System.out.println("Enter radius\n");
				Scanner sc = new Scanner(System.in);
				float r = sc.nextFloat();
				double area = 3.14 *r*r;
				sc.close();
				System.out.println(area);*/
				
				
				//3.print table of a number
				/*System.out.println("Enter table number\n");
				Scanner sc =new Scanner(System.in);
				int t=sc.nextInt();
				for(int i=1; i<=10; i++)
				System.out.println(t+"*"+i+"="+t*i);*/
		
		//To check even or odd number
		/*System.out.println("Enter a number\n");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		if(n % 2 == 0) {
			System.out.println(" This is Even Number ");
		}else {
			System.out.println(" This is Odd number");
			
		}*/
		
		System.out.println("Enter a number\n");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int count =0;
		for(int i=2; i<n;i++) {
			if(n%i==0) {
			count++;
			break;
			}
		}
		if(count==0) {
			System.out.println("It is Prime number");
		}
		else {
			System.out.println("Not Prime number");
			}
		}
	}

				


	


