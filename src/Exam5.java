import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int count=0;
System.out.println("enter the array");
int[] arr=new int[5];
for(int i=0;i<5;i++)
{
	arr[i]=sc.nextInt();
}
int[] ex=new int[5];
ex=arr;

for (int i=0;i<5;i++)
{
	for (int j=0;j<5;j++)
	{
		if (arr[i]==ex[j])
		{
			count++;
		}
	}
}
if (count>arr.length)
{
	System.out.println("there are duplicates");
}
else {
	System.out.println("there are no duplicates");}
	boolean b=false;
for (int i=0;i<5;i++)
{
	for (int j=0;j<5;j++)
	{
		if (arr[i]==ex[j])
		{
			if (i!=j)
			{
				b=true;
				int p=i;
				System.out.println(arr[p]);
			}
		}
	}
}
	}

}
