package stringpkg;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = sc.next().toLowerCase(); 
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (currentChar == vowels[j]) {
                    result += currentChar;
                    count++;
                    break; 
                }
            }
        }

        System.out.println("Vowels found: " + result);
        System.out.println("Number of vowels: " + count);
    }
}



 