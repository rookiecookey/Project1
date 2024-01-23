package questions;

import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Que7 ob=new Que7();
	ob.add();
	}

public void add()
{
	int b = 0;
	System.out.println("enter the integer");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if (a>0)
	{
		while(a>0) {
		b+=a%10;
		//b=b+a;
		a=a/10;
		}
		 System.out.println("sum is "+b);
	}
	else
	{
		System.out.println("enter a number thats greater than zero");
	}
   
}
}