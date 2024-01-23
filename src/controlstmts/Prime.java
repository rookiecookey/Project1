package controlstmts;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0,i;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if (a<=0)
		{
			System.out.println("enter a valid number");
		}else
		{
			 for (i=2;i<=(a-1);i++)
					if(a%i==0) {
		      b=1; 
		      break;
					}}
		if(b==0) {
		    	  System.out.println("its prime");
		}else {
			System.out.println("not prime");
		}}
		    	
}