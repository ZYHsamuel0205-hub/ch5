import java.util.Scanner;

public class Quadratic {
 public static void main (String[] args) {
	 
	 Scanner in = new Scanner (System.in);
	 	System.out.print ("Value for a: ");
		
if (!in.hasNextInt()) {
    String word = in.next();
    System.out.println("Invalid input for a: " + word);
    return;
}

	 	int a = in.nextInt(); 
		
	 	System.out.print ("Value for b: ");

		if (!in.hasNextInt()) {
    String word = in.next();
    System.out.println("Invalid input for b: " + word);
    return;
}
	 	int b = in.nextInt(); 
	 	System.out.print ("Value for c: ");

		if (!in.hasNextInt()) {
    String word = in.next();
    System.out.println("Invalid input for c: " + word);
    return;
}
	 	int c = in.nextInt();

	 double discriminant = Math.pow(b, 2) - 4.0 * a * c;

	
	if (a != 0) {

		if (discriminant > 0) {
	 	double solutionOne = (-b + Math.sqrt(discriminant)) / (2.0 * a);
	 	double solutionTwo = (-b - Math.sqrt(discriminant)) / (2.0 * a);
	
		System.out.println("x = " + solutionOne + ", " + solutionTwo);


	 } else if (discriminant == 0) {
		double solution = -b / (2.0 * a);
		
		System.out.println("x = " + solution);

	 } else {
		System.out.print ("No real solutions");
	
	 }

	} else {
	System.out.println("Invalid input for a: " + a + ". a cannot be zero.");

	}

 }
}
