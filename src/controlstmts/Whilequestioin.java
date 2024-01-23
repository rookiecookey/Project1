package controlstmts;

import java.util.Scanner;

public class Whilequestioin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		char d;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		c=a+b;
		System.out.println("sum is "+c);
		System.out.println("do you want to do the operation again?(yes(y)/no(n))");
		d=sc.next().charAt(0);
		}
		while (d =='y');
	

	}

}
