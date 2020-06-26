import java.util.Scanner;

public class UserInputExamples {

	public static void main(String[] args) {
		
		// Input string value example
		Scanner input = new Scanner(System.in);
		
		String name = new String("");
		
		System.out.print("What is your name?: ");
		
		name = input.next();
		
		System.out.println("Hello " + name);
		
		// Input integers values example
		int x, y, m;
		
		System.out.print("Enter x coordinate: ");
		x = input.nextInt();
		System.out.print("Enter y coordinate: ");
		y = input.nextInt();
		System.out.print("Enter slope: ");
		m = input.nextInt();
		
		// Slope Intercept Form: y = mx + b... b = y - mx
		int b = y - m * x;
		
		System.out.println("The y-intercept for a point at (" + x + ", " + y + ") with a slope of " + m + " is " + b);
		
		// Input float values example
		System.out.print("How many miles did you travel?: ");
		float miles = input.nextFloat();
		System.out.print("How long did it take to travel " + miles + " miles?: ");
		float time = input.nextFloat();
		
		float mph = miles / time;
		
		System.out.println("Average speed of trip: " + mph);
		
		// Close Scanner object 'input' 
		input.close();		
	}
}
