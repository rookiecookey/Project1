package controlstmts;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		if (a%5==0)
		{
			if (a%11==0)
			{System.out.println("it is divisible by both 5 & 11");
}
			else {System.out.println("it is not divisible by 11");
			}
			}
		else {System.out.println("it is not divisible by both numbers");

}}}
