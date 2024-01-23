package practice;


		// TODO Auto-generated method stub
		// Member class
		class Member {
		    // Data members
		    String name;
		    int age;
		    String phoneNumber;
		    String address;
		    double salary;

		    // Method to print details
		    public void printDetails() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Phone Number: " + phoneNumber);
		        System.out.println("Address: " + address);
		        System.out.println("Salary: $" + salary);
		    }
		}

		// Employee class inheriting from Member
		class Employee extends Member {
		    // Additional data member for specialization
		    String specialization;

		    // Method to set employee details
		    public void setEmployeeDetails(String name, int age, String phoneNumber, String address, double salary, String specialization) {
		        this.name = name;
		        this.age = age;
		        this.phoneNumber = phoneNumber;
		        this.address = address;
		        this.salary = salary;
		        this.specialization = specialization;
		    }
		}

		// Manager class inheriting from Member
		class Manager extends Member {
		    // Additional data member for department
		    String department;

		    // Method to set manager details
		    public void setManagerDetails(String name, int age, String phoneNumber, String address, double salary, String department) {
		        this.name = name;
		        this.age = age;
		        this.phoneNumber = phoneNumber;
		        this.address = address;
		        this.salary = salary;
		        this.department = department;
		    }
		}

		public class Inheritance {
		    public static void main(String[] args) {
		        // Creating an Employee object
		        Employee employee = new Employee();
		        employee.setEmployeeDetails("John Doe", 25, "123-456-7890", "123 Main St", 50000.0, "Software Developer");

		        // Creating a Manager object
		        Manager manager = new Manager();
		        manager.setManagerDetails("Jane Smith", 35, "987-654-3210", "456 Broad St", 80000.0, "IT");

		        // Printing details of the Employee
		        System.out.println("Employee Details:");
		        employee.printDetails();
		        System.out.println("Specialization: " + employee.specialization);
		        System.out.println();

		        // Printing details of the Manager
		        System.out.println("Manager Details:");
		        manager.printDetails();
		        System.out.println("Department: " + manager.department);
		    }
		
		


	}


