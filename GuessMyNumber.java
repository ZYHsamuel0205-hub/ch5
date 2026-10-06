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
		
		 keepGuessing (numberEntered, number);
		 
		 System.out.println ("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        System.out.print ("Type a number: ");
		numberEntered = in.nextInt(); 
		
		 boolean keepGoing = keepGuessing (numberEntered, number);
		 
		 if (keepGoing == false) {
			  return;
		 }
		 
		 System.out.println ("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        System.out.print ("Type a number: ");
		numberEntered = in.nextInt(); 
		
		 keepGuessing (numberEntered, number);
		
		System.out.println ("The number I am thinking of is indeed " + number);
    }		 
    
    public static boolean keepGuessing (int numberEntered, int number) {
		if (numberEntered > number) {
			System.out.println ("TOO HIGH!!");
			System.out.print ("Guess again:");
			numberEntered = in.nextInt(); 
		} else if (numberEntered < number) {
			System.out.println ("TOO LOW!!");	
			System.out.print ("Guess again:");
			numberEntered = in.nextInt(); 
		} else {
			System.out.println ("WOW.");
	}
}
