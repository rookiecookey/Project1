package practice;

import java.util.Scanner;

public class Passwordnew {

    public static void main(String[] args) {
        // Define the correct password
        final String correctPassword = "secure123";

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize a boolean flag for password validation
        boolean isValidPassword = false;

        // Use a do-while loop for password validation
        do {
            // Prompt the user to enter a password
            System.out.print("Enter the password: ");
            String userPassword = scanner.nextLine();

            // Check if the entered password is correct
            if (userPassword.equals(correctPassword)) {
                System.out.println("Password accepted. Access granted!");
                isValidPassword = true;
                break;                        // Set the flag to true to exit the loop(break is not needed)
            } else {
                System.out.println("Incorrect password. Try again.");
            }

        } while (!isValidPassword);

        // Close the scanner
        scanner.close();
    }
}

