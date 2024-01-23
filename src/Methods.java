import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		Methods ob=new Methods();
		System.out.println("enter the numbers");
		Scanner sc=new Scanner (System.in);
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		ob.add();
		int subanswer=ob.sub();
		System.out.println(subanswer);
		ob.mul(v1, v2);
		System.out.println(ob.div(v1, v2));
		//if there is no taking in any values for 'with parameters' use ob.mul(a,b);
		
		
}
	


//method without returntype and without parameters
public void add()
{
	int a=20,b=10,c;
	c=a+b;
	System.out.println(c);
}

//method with returntype and without parameters
public int sub()
{
	int a=20,b=10,c;
	c=a-b;
	return c;
}
//method without returntype and with parameters
public void mul(int a,int b)
{
	int c=a*b;
	System.out.println(c);
}
//Method with returntype and with parameters
public double div(int a,int b)
{
	double c=a/b;
	return c;
}
}