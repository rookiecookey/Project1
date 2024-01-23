package Constructor;

public class Constructoor {
	int empid;
	String empname;
	public Constructoor(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	//or public void display(){sop("empid="empid);sop("empname="+empname);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoor emp=new Constructoor(101,"arya");//emp.display();
		Constructoor emp2=new Constructoor(102,"viviek");//emp2.display();
				System.out.println(emp.empid);
		System.out.println(emp.empname);
System.out.println(emp2.empid);
System.out.println(emp2.empname);
		
		
	}

}
