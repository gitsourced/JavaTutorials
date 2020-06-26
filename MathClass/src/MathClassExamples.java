import java.util.Scanner;

public class MathClassExamples {

	public static void main(String[] args) {
		
		// Examples of methods cos and sin from the Math class
		// Pi = 180 degrees
		double cos180 = Math.cos(Math.PI);
		double cos0 = Math.cos(0);
		
		System.out.println(cos180);
		System.out.println(cos0);
		
		double sin90 = Math.sin(Math.PI / 2);
		double sin270 = Math.sin(3*Math.PI / 2);
		
		System.out.println(sin90);
		System.out.println(sin270);
		
		// Examples of method log10 from the Math class
		System.out.println(Math.log10(10));
		
		// Examples of method pow from the Math class
		System.out.println(Math.pow(10, 6));
		
		// Using Math class methods to calculate the hypotenuse 
		// of a right triangle using the Pythagorean Theorem
		double leg1, leg2, hypot;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter leg1: ");
		leg1 = input.nextDouble();
		System.out.print("Enter leg2: ");
		leg2 = input.nextDouble();
		
		hypot = Math.sqrt(Math.pow(leg1,  2) + Math.pow(leg2, 2));
		
		System.out.println("Hypotenuse: " + hypot);
		
		input.close();
	}
}
