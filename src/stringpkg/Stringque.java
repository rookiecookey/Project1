package stringpkg;

public class Stringque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Testing training centre";
		String[] st=s.split(" ");
		for (String e:st)
		{
			System.out.println(e);
		}
		for (int i=st.length-1;i>=0;i--)
		{
			System.out.println(st[i]);
		}
		
		String c="Hello world";
		System.out.println(c.replace("Hello", "hi"));		

	}

}
