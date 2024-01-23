package array;

import java.util.Scanner;

public class Sumandavg {
 

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int c=0,d=0;
			System.out.println("enter the array");
			Scanner sc=new Scanner(System.in);
			int[] a=new int[3];
			for (int i=0;i<3;i++)
			{
			a[i]=sc.nextInt();
			c+=a[i];
			

		}
			d=c/3;//or a.length
			System.out.println("the sum is ="+c);
			System.out.println("avg is "+d);
			
			
			
		}
	}
