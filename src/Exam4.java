
import java.util.Scanner;

public class Exam4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the array");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break; // break once a duplicate is found
                }
            }
        }

        if (count > 0) {
            System.out.println("There are duplicates");
        } else {
            System.out.println("There are no duplicates");
        }

        boolean b = false;
        System.out.println("Duplicate elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (i != j) {
                        b = true;
                        System.out.println(arr[i]);
                        break; // break once a duplicate is found
                    }
                }
            }
        }
    }
}
