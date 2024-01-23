package array;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array");
		Scanner sc=new Scanner(System.in);
		String[] a=new String[3];
		for (int i=0;i<3;i++)
		{
		a[i]=sc.next();

	}
		System.out.println("the array is =");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
	}
}
