package controlstmts;

import java.util.Scanner;

public class Primee {

    public static void main(String[] args) {
        int a, i, b = 0;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Enter a valid number greater than 0.");
        } else {
            for (i = 2; i <= (a - 1); i++) {
                if (a % i == 0) {
                    b = 1; // If divisible, set 'b' to 1
                    break;
                }
            }
            if (b == 0) {
                System.out.println("It's a prime number.");
            } else {
                System.out.println("It's not a prime number.");
            }
        }

        sc.close();
    }
}
