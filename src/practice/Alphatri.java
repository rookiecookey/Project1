package practice;

public class Alphatri {
	
	    public static void main(String[] args) {
	        int n = 5; 

	        for (int i = 0; i < n; i++) {
	           
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print(" ");
	            }

	            
	            for (int s = 0; s <= i; s++) {
	            	 char ch = (char) ('A' + s);
	                System.out.print(ch + " ");
	            }

	          
	            System.out.println();
	        }
	    }
	}

