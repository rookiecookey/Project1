package controlstmts;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0,rem=0,b=0;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		b=a;
		while (a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if (rev==b)
		{
			System.out.println("it is a palindrome number");
		
		}
		else
		{
			System.out.println("its not a palindrome number");
		}

	}

}
