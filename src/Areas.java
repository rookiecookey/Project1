
public class Areas {

	public static void main(String[] args) {
		Areas c=new Areas();
		c.triangle();
		double b=c.circle();
		System.out.println(b);
		int h=c.square(5);
		System.out.println(h);
		c.rectangle(4, 3);

	}
	public void triangle()
	{
		double b=3,h=5,v=.5,a;
		a=v*b*h;
		System.out.println(a);
		}
	public double circle()
	{
		double a=2,b;
		b=3.14*a*a;
		return b;
	}
	public int square(int a) 
	{
		int b=a*a;
		return b;
	}
	public void rectangle(int l,int b)
	{
		int a=l*b;
		System.out.println(a);
	}
}
