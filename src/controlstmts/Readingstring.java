package controlstmts;

import java.util.Scanner;

public class Readingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		System.out.println(s);
		char c=s.charAt(0);//for displaying first character
		System.out.println("first characcter"+c);
		System.out.println("enter a chracter");
		char b=sc.next().charAt(0); //for displaying the character
        System.out.println("the cahracter is "+b);
	}

}
