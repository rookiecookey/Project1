package Abstraction;
interface cardetails//NB..can make another interface with the keyword extends from the parent interface..also implements can take up more than one option with a ,
{
	public void acceleration();
}
class ford implements cardetails
{

	@Override
	public void acceleration() {
		System.out.println("ford can accelerate");
		
	}
	
}
class ferrari implements cardetails
{

	@Override
	public void acceleration() {
		System.out.println("ferrari can accelerate");
		
	}
	
}
public class Interfacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ford ob=new ford();
ob.acceleration();
ferrari b=new ferrari();
b.acceleration();
	}

}
