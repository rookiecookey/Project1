package encapsulation;
class emp{
	private String empname;
	private String empdesgntion;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesgntion() {
		return empdesgntion;
	}
	public void setEmpdesgntion(String empdesgntion) {
		this.empdesgntion = empdesgntion;
	}
	
}
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
emp ob=new emp();
ob.setEmpname("arjun");
ob.setEmpdesgntion("tester");
	System.out.println(ob.getEmpname());
	System.out.println(ob.getEmpdesgntion());
	}

}
