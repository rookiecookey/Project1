package controlstmts;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("choose the calulation you want to perform");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		int d=sc.nextInt();
		switch(d)
		{
		case 1:System.out.println("c="+(a+b));
		break;
		case 2:System.out.println("c="+(a-b));
		break;
		case 3:System.out.println("c="+(a*b));
		break;
		case 4:System.out.println("c="+(a/b));
		break;
		default:System.out.println("enter a valid option");
		
		
		}
		

	}

}
