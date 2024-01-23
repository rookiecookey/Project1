package Inheritance;

public class Hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat s=new Cat();
s.animaldetails();
s.catdetails();
Dog b=new Dog();
b.animaldetails();
b.dogdetails();
	}

}
class Animal{
	public void animaldetails()
	{
		System.out.println("there are a few animals");
	}
}
class Cat extends Animal{
	public void catdetails()
	{
		System.out.println("cat is an animal");
	}
}
class Dog extends Animal{
public void dogdetails()
{
	System.out.println("dog is an animal");
}
}
 