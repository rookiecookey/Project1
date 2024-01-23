package stringpkg;

import java.util.Scanner;

public class PalinStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.next();
		
		String rev="";
		
		
			
		for(int i=a.length()-1;i>=0;i--)
		{
		 	rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(a))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		

	}

}
