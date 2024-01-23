package array;

import java.util.Scanner;

public class Usernamepass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a[][]=new String[4][2];
		System.out.println("enter the usernames and password");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.next();
			}
				}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
				}
		
		
	
	}

}
