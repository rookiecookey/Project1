package Inheritance;

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Babydog b=new Babydog();
b.animaldetails();
b.dogdetails();
b.babydogdetails();
	}

}
class Animal 
{
	public void animaldetails()
	{
		System.out.println("the animal is a dog");
	}
}
class Dog extends Animal
{
	public void dogdetails()
	{
		System.out.println("dog is an animal");
	}
}
class Babydog extends Dog
{
	public void babydogdetails()
	{
		System.out.println("baby dog is a dog");
	}

}