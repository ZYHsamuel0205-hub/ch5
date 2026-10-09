import java.util.Scanner;

public class Triangle {
	public static void main (String[] args) {
	
	Scanner in = new Scanner (System.in);
	//input for a
	System.out.print ("Length of stick a: ");

	if (!in.hasNextInt()) {
		String word = in.next();
		System.out.println("Invalid input for a: " + word);
		return;
	}

	int a = in.nextInt();
	if (a <= 0) {
	System.out.println("Invalid input for a: " + a);
    return;
		}
	
	//input for b
	System.out.print ("Length of stick b: ");

	if (!in.hasNextInt()) {
		String word = in.next();
		System.out.println("Invalid input for b: " + word);
		return;
	}

	int b = in.nextInt();
	if (b <= 0) {
	System.out.println("Invalid input for b: " + b);
    return;		
		}
	
	//input for c
	System.out.print ("Length of stick c: ");

	if (!in.hasNextInt()) {
		String word = in.next();
		System.out.print ("Invalid input for c: " + word);
		return;
	}

	int c = in.nextInt();
	if (c <= 0) {
	System.out.println("Invalid input for c: " + c);
    return;
		}
	
	if (a >= b + c || b >= a + c || c >= a + b) {
		System.out.print ("You CANNOT form a triangle!");
		} else {
		System.out.print ("You CAN form a triangle!");
		}
	}

}
