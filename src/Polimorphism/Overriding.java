package Polimorphism;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       child ob=new child();
       ob.job();
	}

}
class parent{
public void job()
{
	System.out.println("teacher");
}
}
class child extends parent
{

	@Override
	public void job() {
		System.out.println("doctor");
		// TODO Auto-generated method stub
		super.job();
	}
	
}

