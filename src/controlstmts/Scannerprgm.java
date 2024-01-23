package controlstmts;

import java.util.Scanner;

public class Scannerprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		c=a+b;
		System.out.println("sum of a and b is "+c);

	}

}
