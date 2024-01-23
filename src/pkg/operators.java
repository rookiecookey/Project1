package pkg;

public class operators {

	public static void main(String[] args) {
		
		//arithmetic
		int a=20,b=10;
		System.out.println("sum of a and b is "+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		//assignment
		int c=a;
		System.out.println("sum is "+(a+=b));
		System.out.println("difference is "+(a-=b));
		System.out.println("div is "+(a/=b));
		System.out.println("mod is "+(a%=b));
		System.out.println("a is "+a);
		//relational
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a!=b);
		System.out.println("hi");
		//logical
		String username="ehd";
		String pswd="dgdhdg2";
		System.out.println(username=="ehd"&&pswd=="dgdhdg2");
		System.out.println(username=="ehd"||pswd=="dgdhdg2");
		System.out.println(!(username=="ehd"));
		//unary
				int i=10;
				System.out.println(i++);
				System.out.println(i);
				System.out.println(++i);
		//ternary
		int u=12,u1=16;
		String U=u>u1?"u is greater":"u1 is greater";
		System.out.println(U);
	

	}

}
