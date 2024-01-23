package practice;

import java.util.Scanner;

interface bankdetails {
    static int f = 2000, a = 0, n = 0;  // Removed 'c' from the interface

    boolean accountdetails();

    void balance();

    void withdraw();

    void deposit();
}

class FBI implements bankdetails {
    private int c = 0;  // Moved 'c' to the class level

    @Override
    public boolean accountdetails() {
        System.out.println("Enter the account number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 541;

        if (a == n) {
            System.out.println("Account name=Arun");
            System.out.println("Account number=301");
            return true; // Condition is satisfied
        } else {
            System.out.println("Enter a valid account number");
            return false; // Condition is not satisfied
        }
    }

    @Override
    public void balance() {
        System.out.println("Balance amount=" + c);
    }

    @Override
    public void withdraw() {
        System.out.println("Enter the amount you want to withdraw");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        c = f - b;
        System.out.println("Balance = " + c);
    }

    @Override
    public void deposit() {
        System.out.println("Enter the amount you want to deposit");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        c = c + d;
        System.out.println("Balance amount =" + c);
    }
}

public class Bankque {

    public static void main(String[] args) {
        FBI ob = new FBI();

        // Check the condition before executing subsequent methods
        if (ob.accountdetails()) {
            ob.balance();  // Show initial balance before any transactions
            ob.withdraw();
            ob.deposit();
            ob.balance();  // Show updated balance after transactions
        } else {
            System.out.println("Condition not satisfied. Methods not executed.");
        }
    }
}
