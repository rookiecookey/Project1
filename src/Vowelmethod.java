import java.util.Scanner;

public class Vowelmethod {

	public static void main(String[] args) {
		Vowelmethod d=new Vowelmethod();
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = sc.next().toLowerCase();
        int y=d.vowel(s);
        System.out.println(y);
		

	}
public int vowel(String s)
{
char[] vowels = {'a','e','i','o','u'};
//String d="";
int count=0;


for (int i = 0; i < s.length(); i++) {
    for (int j = 0; j < vowels.length; j++) {
        if (s.charAt(i) == vowels[j]) {
        	//d=d+s.charAt(i);
        	
        	count++;
        	//return d;
        	
        }
        }
    }
return count;
}
}
