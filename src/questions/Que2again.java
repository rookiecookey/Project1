package questions;

import java.util.Scanner;

public class Que2again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter three numbers");
Scanner sc=new Scanner (System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b&&b>c)
{
	System.out.println("its in descending order");
}
else if(c>b&&b>a)
{
	System.out.println("its in ascendong order");
}
else
{
	System.out.println("not in any particular order");
}
	}

}
