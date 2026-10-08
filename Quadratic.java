import java.util.Scanner;

public class Quadratic {
 public static void main (String[] args) {
	 
	 Scanner in = new Scanner (System.in);
	 
	 	System.out.print ("Value for a: ");
	 	int a = in.nextInt(); 
	 	System.out.print ("Value for b: ");
	 	int b = in.nextInt(); 
	 	System.out.print ("Value for c: ");
	 	int c = in.nextInt();
	 	
	 	int solutionOne = ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c));
	 	int solutionTwo = ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c));
	 	
	 	System.out.print ("x = " + solutionOne + ", " + solutionTwo);
	 }
}
