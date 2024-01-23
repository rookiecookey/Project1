package practice;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        // Correct password
        String correctPassword = "secure123";

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Use a do-while loop for password validation
        do {
            // Prompt the user to enter a password
            System.out.print("Enter the password: ");
            String userInput = scanner.next();

            // Check if the entered password is correct using ==
            if (correctPassword == userInput) {
                System.out.println("Password is correct!");
                break; // Exit the loop if the password is correct
            } else {
                System.out.println("Password is incorrect. Try again.");
            }

        } while (true); // Infinite loop; break statement will exit when the correct password is entered

        // Close the scanner
        scanner.close();
    }
}
