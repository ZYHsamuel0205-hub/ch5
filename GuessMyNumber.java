import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        
        Scanner in = new Scanner (System. in);
        int numberEntered;
       
       	System.out.println ("I'm thinking of a number between 1 and 100. Can you guess what it is?");
       
       //first guess
        System.out.print ("Type a number: ");
		numberEntered = in.nextInt(); 
		
		boolean keepGoing = keepGuessing (numberEntered, number);
		 
		if (keepGoing == false) {
			System.out.println ("The number I am thinking of is indeed" + number);
			return;
		 }
		 
		//second guess
		System.out.print ("Type another number: ");
		numberEntered = in.nextInt(); 
		
		keepGoing = keepGuessing (numberEntered, number);
		 
		if (keepGoing == false) {
			System.out.println ("The number I am thinking of is indeed" + number);
			return;
		 }

		//third guess
		System.out.print ("Type another number: ");
		numberEntered = in.nextInt(); 
		
		keepGoing = keepGuessing (numberEntered, number);
		
		if (keepGoing == false) {
			System.out.println ("The number I am thinking of is indeed" + number);
			return;
		 }
		
		 System.out.println ("Uh oh, you ran out of guesses...");
		 System.out.println ("The number I am thinking of is " + number);
    }		 
    
    public static boolean keepGuessing (int numberEntered, int number) {
		if (numberEntered > number) {
			System.out.println ("TOO HIGH!!");
			return true;
		} else if (numberEntered < number) {
			System.out.println ("TOO LOW!!");	
			return true;
		} else {
			System.out.println ("WOW.");
			return false;
		}
	}
}
