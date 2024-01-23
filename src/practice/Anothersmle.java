package practice;

import java.util.Scanner;

public class Anothersmle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char d;
		String a="apple",b="banana",c="carrot";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the letter for the word you want to print(a,b or c)");
		d=sc.next();
		
		do {
			if (d==a)
			{
				System.out.println(a);
			}
			else if (d==b)
			{
				System.out.println(b);
			}
			else if (d==c)
			{
				System.out.println(c);
			}
			else
			{
				System.out.println("enter a valid letter");
			}
		}
		while (d==a)
	}

}
