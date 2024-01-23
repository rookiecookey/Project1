package Inheritance;

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child b=new child();
		b.parentmethod();
		b.childmethod();

	}

}
class parent
{
	public void parentmethod()
	{
		System.out.println("parent");
	}
}
class child extends parent
{
	public void childmethod()
	{
		System.out.println("child");
	}
}