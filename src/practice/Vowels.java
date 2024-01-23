package practice;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = sc.next().toLowerCase(); 
        char[] vowels = {'a','e','i','o','u'};
        String d="";
        int count=0;
        

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {//or if(s.charAt(i)=='a'||s.charAt(i)=='e'||........){count++}
                if (s.charAt(i) == vowels[j]) {
                	d=d+s.charAt(i);
                    //System.out.println("There are vowels");
                    //System.out.println(s.charAt(i));
                	count++;
                }
            }
        }
        System.out.println("vowels in the word are "+"'"+d+"'");
        System.out.println("no.of vowels ="+count);
    }
}
