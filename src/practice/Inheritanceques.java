package practice;

public class Inheritanceques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		member b=new member();
		b.printdetails();

	}

}
class member{
	String name;
	int age;
	long phoneno;
	String address;
	int salary;
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
}
class employee extends member
{
	String specialization;
}
class manager extends member
{
	String department;
}