import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.next();

for (int i=s.length()-1;i>=0;i--)
{
	System.out.print(s.charAt(i));
}
}
}