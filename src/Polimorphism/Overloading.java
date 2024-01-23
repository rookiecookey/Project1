package Polimorphism;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading b=new Overloading();
		b.add();
        b.add(21, 5);
        b.add(2.3,40);
        b.add(20, 37.42);
	}


public void add()
{
	int a=20,b=10,c;
	c=a+b;
	System.out.println(c);
}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void add(int a,double b)
{
 double c=a+b;
 System.out.println(c);
}
public void add(double a,int b)
{
	double c=a+b;
	System.out.println(c);
}
}