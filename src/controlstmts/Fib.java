package controlstmts;



public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int a=0,b=1,c=20,d;
	    System.out.println(a);
	    System.out.println(b);
	    for (int i=3;i<=c;i++)
	    {
	    	d=a+b;
	    	a=b;
	    	b=d;
	    	System.out.println(d);
	    }
	   
				

	}

}
