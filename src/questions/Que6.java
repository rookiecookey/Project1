package questions;

import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s3="welcome to java programming";
		s=s.trim();		
		String[] st=s.split(" ");//{} way
		System.out.println("the words are ");
for (String e:st)
{
	System.out.println(e);
	//System.out.println(s.length()-(st.length-1));
}
		//String a=s;
		//s.trim();
System.out.println("the number of wrods :");
		System.out.println(s.length()-(st.length-1));
		

	}

}
