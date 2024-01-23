package practice;

import java.util.Scanner;

public class Maxminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter the array");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
	int c=a[0];
	int d=a[0];
	
	for (int i=1;i<5;i++)
	{
		if (a[i]>c)
		{
			c=a[i];
		}
		if(a[i]<d)
		{
			d=a[i];
		}
	}
		System.out.println("max value is "+c);
		System.out.println("min value is "+d);
	}

}
