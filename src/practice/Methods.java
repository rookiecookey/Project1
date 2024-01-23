package practice;



	import java.util.Random;

	public class Methods {

	    public static void main(String[] args) {
	        Methods h = new Methods();
	        int randomNumber = h.generateRandomNumber();
	        System.out.println("Generated Random Number: " + randomNumber);
	    }

	    public int generateRandomNumber() {
	        Random random = new Random();
	        // Generates a random number between 1 and 100 (inclusive)
	        return random.nextInt(100) + 1;
	    }
	}


