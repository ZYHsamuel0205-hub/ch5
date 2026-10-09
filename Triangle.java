import java.util.Scanner;

public class Triangle {
	public static void main (String[] args) {
	
	Scanner in = new Scanner (System.in);
	
	System.out.print ("Length of stick a: ");
	int a = in.nextInt();
	if (a <= 0) {
	System.out.println("Invalid input for a: " + a);
    return;
		}
	
	System.out.print ("Length of stick b: ");
	int b = in.nextInt();
	if (b <= 0) {
	System.out.println("Invalid input for b: " + b);
    return;		
		}
	
	System.out.print ("Length of stick c: ")
	int c = in.nextInt();
	if (c <= 0) {
	System.out.println("Invalid input for c: " + c);
    return;
		}
	
	if (a < b + c || b < a + c || c < b + c) {
		System.print.out ("You CAN form a triangle!");
		} else {
		System.print.out ("You CANNOT form a triangle!");
			}
	}

}
