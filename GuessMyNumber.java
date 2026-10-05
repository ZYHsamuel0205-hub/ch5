import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        
        Scanner in = new Scanner (System. in);
        int numberEntered = 0; //declare value first, then change later
       
       	System.out.println ("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        System.out.print ("Type a number: ");
		numberEntered = in.nextInt(); 
		System.out.println ("___________________________________________");
		
		enterNumber (n) = in.nextInt(); 
		enterNumber (n) = in.nextInt(); 
		enterNumber (n) = in.nextInt(); 

        //int difference = number - numberEntered;
		
		//System.out.println ("Your guess is: " + numberEntered );
		//System.out.println ("The number I was thinking of is: " + number);
    }		 
    
    public static enterNumber (int n) {
			if (numberEntered > number) {
			System.out.println ("TOO HIGH!!");
			System.out.print ("Guess again:");
			numberEntered = in.nextInt(); 
		} else if (numberEntered < number) {
			System.out.println ("TOO HIGH!!");	
			System.out.print ("Guess again:");
			numberEntered = in.nextInt(); 
		} else {
			System.out.println ("WOW.");
		}
	}
}
