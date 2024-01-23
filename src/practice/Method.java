package practice;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method b=new Method();
		double g=b.calculateAverage(85.5,92.0);
		System.out.println(g);

	}
	public double calculateAverage(double sub1,double sub2)
	{
		double avg;
		avg=(sub1+sub2)/2;
		return avg;
	}

}
