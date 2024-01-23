package practice;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		int a=12,b;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("enter the number we guessed");
		b=sc.nextInt();
		if (b!=a)
		System.out.println("wrong");
		else 
			System.out.println("right");
		}
		while (b!=a);
		
		
}

}
