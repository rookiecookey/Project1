package practice;

import java.util.Scanner;

public class Palinstrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		String a="";
		for (int i=s.length()-1;i>=0;i--)
		{
			a=a+s.charAt(i);
		}
		if(a.equals(s))
		{
			System.out.println("its palindrome");
		}else
		{
			System.out.println("its not palindrome");
		}

	}

}
