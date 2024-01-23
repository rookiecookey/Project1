package controlstmts;

public class Jumping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=567,rev=0,rem;


while (i!=0)
{ 
rem=i%10;
rev=rev*10+rem;
i=i/10;
}
	
	

	System.out.println("reverse is "+rev);
	}

}
