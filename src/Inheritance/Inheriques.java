package Inheritance;

public class Inheriques {

	

	

		public static void main(String[] args) {
			
			Employee ob1= new Employee();
			Manager ob2 = new Manager();
			ob1.Name="Jithin";
			ob1.Age =26;
			ob1.Phoneno =9565783;
			ob1.Address="My address";
			ob1.Salary= 500000;
			ob1.specialization = "Testing";
			ob1.printdetails();
			
			System.out.println();
			
			ob2.Name ="Jithin123";
			ob2.Age=20;
			ob2.Phoneno=366;
			ob2.Salary = 20000;
			ob2.Department ="HR";
			ob2.printdetails();
			
			
		}

	}

	class Member
	{
		String Name ;
		int Age;
		int Phoneno  ;
		String Address ;
		int Salary ;
		
		public void printdetails()
		{
			//Member ob= new Member();
			System.out.println("The name is "+ Name);
			System.out.println("The Age is "+ Age);
			System.out.println("The Phonenumber is "+ Phoneno);
			System.out.println("The Address is "+ Address);
			System.out.println("THe Salary is "+ Salary);
		}
	}

	class Employee extends Member
	{
		String specialization;

	}
	class Manager extends Member
	{
		String Department;
	}
