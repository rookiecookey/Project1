package questions;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,5,3,9};
		int b=a[0];
		for (int i=1;i<a.length;i++)
		{
			if (a[i]>b)
			{
				b=a[i];
			}
		}
System.out.println("largest is "+b);
	}

}
