package array;

import java.util.Scanner;

public class Posinegazero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0,countt=0,counttt=0;
       System.out.println("enter the array");
       int[] arr=new int[5];
       for(int i=0;i<arr.length;i++)
       {
    	   arr[i]=sc.nextInt();
       }
       System.out.println("the array is ");
       for (int i=0;i<arr.length;i++)
       {
    	   System.out.println(arr[i]);
       }
       for(int i=0;i<arr.length;i++)
       {
    	   if(arr[i]==0)
    		   
    	   {
    		   count++;
    		  
    	   }
    	   
    	 if(arr[i]<0)
    		   
    	   {
    		   countt++;
    		   
    	   }
    	   
    	   if(arr[i]>0)
    		   
    		   {
    		   counttt++;
    		  
    		   }
       }
       System.out.println("no.of zeroes are "+count);
       System.out.println("no.of negatives are "+countt);
       System.out.println("no.of positives are "+counttt);
       }

}
