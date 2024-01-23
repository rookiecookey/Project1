package excephand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excep {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream ob=new FileInputStream("E://Book1.xlsx");
		try {
		int c=5/0;
		System.out.println(c);
		}
		catch(Exception e)//use like this if you dont know what the exception is 
		{
			System.out.println(e.getMessage());
		}
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("exception details");
		}

	}

}
