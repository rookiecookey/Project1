package questions;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter three numbers");
Scanner sc=new Scanner (System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b)
{
	if(b>c)
	{
		System.out.println("they are in decreasing order");
	}
}
else if(c>b)
{
	if(b>a)
	{
		System.out.println("they are in increasing order");
	}
}
else 
{
	System.out.println("they arent in any particular order");
}
	
	}

}
