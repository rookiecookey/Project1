package array;

import java.util.Scanner;

public class Singledimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array");
		Scanner sc=new Scanner(System.in);
		int[] a=new int[3];
		for (int i=0;i<3;i++)
		{
		a[i]=sc.nextInt();

	}
		System.out.println("the array is =");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
	}
}
