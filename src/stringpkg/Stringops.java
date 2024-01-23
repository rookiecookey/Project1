package stringpkg;

public class Stringops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="   welcome ";
		String s2="Hello welcome";
		System.out.println(s+s1);
		System.out.println(2+3+s+3+4);

		//equals
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//contains
		System.out.println(s2.contains("welcome"));
		
		//uppercase lowercase
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//length
		System.out.println(s.length());
		
		//startswith endswith
		System.out.println(s2.startsWith("hello"));
		System.out.println(s2.endsWith("welcome"));
		
		//trim
		System.out.println(s1.trim());
		
	    //replace
		System.out.println(s2.replace("Hello", "hi"));
		
		//split
		String s3="welcome to java programming";
				String[] st=s3.split(" ");//{} way
		for (String e:st)
		{
			System.out.println(e);
		}
		
		//substring
		System.out.println(s.substring(1,3));//space is considered as an index
		
		//tocharArray
		String s4="hello welcome";
				char[] c=s4.toCharArray();
		for(char e:c)
		{
			System.out.println(e);
		}
	}

}
