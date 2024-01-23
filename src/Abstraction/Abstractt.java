package Abstraction;
abstract class car{
	abstract public void acceleration();
	abstract public void speedlimit();//abstarct method
	public void carengine()
	{
		System.out.println("car engine");//since there is a regular method abstraction isnt 100% achieved
	}
	
}
class kia extends car{

	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("kia acceleration");
		
	}

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("kia speedlimit");
		
	}
	
}
class maruti extends car{

	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("maruti acceleration");
	}

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("maruti speedlimit");
	}
	
}

public class Abstractt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
maruti ob=new maruti();
ob.acceleration();
ob.speedlimit();
kia b=new kia();
b.acceleration();
b.speedlimit();
b.carengine();
	}

}
