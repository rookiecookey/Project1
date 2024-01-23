package controlstmts;

public class Armstrong {

	public static void main(String[] args) {
		
		int n=153,temp=n,r=0,s=0;
		
		while (n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
			if(temp==s)
			{
				System.out.println("armstrong");
			}else
			{
				System.out.println("not armstrong");
			}

	}

}
