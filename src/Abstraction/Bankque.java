package Abstraction;

import java.util.Scanner;

interface bankdetails
{
	//static int f=2000,a=0,n=0,b=0,d=0,e=0,c=0;
	public void accountdetails();
	public void balance();
	public void withdraw();
	public void deposit();
}
class FBI implements bankdetails
{
	static int f=2000,a=0,n=0,b=0,d=0,e=0,c=0;
private boolean p=false;
	@Override
	public void accountdetails() {
		
		
		System.out.println("enter the account number");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=541;
		if(a==n) {
			System.out.println("Account name=Arun");
			System.out.println("Account number=301");
			p=true;
			}
		else
		{
			System.out.println("enter a valid account number");
		}
		
	}

	@Override
	public void balance() {
		if (p==true) {
		System.out.println("Balance amount=2000");
		}
		else {
			System.out.println("wrong input cant view the balance");
		}
		
		
	}

	@Override
	public void withdraw() {
		if(p==true) {
		System.out.println("enter the amount you want to withdraw");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		f=f-b;
		System.out.println("balance = "+f);
		}
		else {
			System.out.println("wrong input cant withdraw the amount");
		}
	}

	@Override
	public void deposit() {
		
		if (p==true) {
			
		System.out.println("enter the amount you want to deposit");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		f=f+d;
		System.out.println("balance amount ="+f);
		}
		else {
			System.out.println("wrong input cant deposit");
		}
	}


	
}

public class Bankque {
	
	public static void main(String[] args) {
		
		FBI ob=new FBI();
		ob.accountdetails();
		
		ob.balance();
		ob.withdraw();
		ob.deposit();
		
	
	}
}
