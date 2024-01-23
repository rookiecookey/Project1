package pkg;

public class operations {

	public static void main(String[] args) {
		//swapping
		int A=34,B=43,C;
		C=A;
        A=B;
        B=C;
		System.out.println(A);
		System.out.println(B);
		//swapping without using variable
		int a=20,b=30;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		//if two numbers are equal
		int  Q=23,W=45;
		System.out.println(Q==W);
		//assign values of variable a and b as 55 and 70 resp and then check if both the conditions a<50 and a<b is true
		int E=55,R=70;
		System.out.println(E<50 && E<R);
		//print 2nd didgit
		int T=17;
		T=T%10;
		System.out.println(T);
		
		
	

	}

}
