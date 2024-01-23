package questions;

import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a character");
Scanner sc=new Scanner(System.in);
String s=sc.next();
char a=s.charAt(0);
if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u')
//if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
	System.out.println("those are vowels");
}
else
{
	System.out.println("they are consonants");
}

	}

}
