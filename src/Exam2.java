import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter the array");

for (int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
for (int i=0;i<arr.length;i++)
{
	if(arr[i]%2==0)
	{
		System.out.println(arr[i]+" is an even number");
	}
	
}
System.out.println();
for (int i=0;i<arr.length;i++)
{
	if (arr[i]%2!=0)
	{
		System.out.println(arr[i]+" is an odd number ");
	}
}
	}

}
