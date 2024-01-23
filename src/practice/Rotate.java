package practice;

import java.util.Scanner;
import Accessmodifier.Access;

public class Rotate extends Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotate c=new Rotate();
		c.c=40;
		Scanner sc=new Scanner(System.in);
		int arraysize,temp,rot;
		
		System.out.println("enter the legth of the array");
		arraysize=sc.nextInt();
		int[] a=new int[arraysize];
		System.out.println("enter the array");
		
		for (int i=0;i < arraysize;i++)
		{
			a[i]=sc.nextInt();
		}
System.out.println("the array is ");
for (int i=0;i < arraysize;i++)
{
	System.out.println(a[i]);;
}
System.out.println("enter the number of places you need to rotate");
rot=sc.nextInt();
for (int i=1;i<=rot;i++)
{
	a[i]=a[a.length-1];
	temp=a[i];
}
	}}

