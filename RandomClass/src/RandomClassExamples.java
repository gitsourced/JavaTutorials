import java.util.Random;

public class RandomClassExamples {

	public static void main(String[] args) {
		
		// Declares Random object 'rand'
		Random rand = new Random();
		
		int num1;
		
		// Set num1 equal to a value between -2^31 and 2^31
		num1 = rand.nextInt();
		System.out.println(num1);

		// Set num1 equal to a value between 1 and 6
		num1 = rand.nextInt(6);
		System.out.println(num1 + 1);
		
		// Set num1 equal to a value between 1 and 52
		num1 = rand.nextInt(52);
		System.out.println(num1 + 1);
		
		float num2;
		
		// Set num2 equal to a float value between 0 and 1
		num2 = rand.nextFloat();
		System.out.println(num2);
		
		// Set num2 equal to a float value between 0 and 3
		num2 = rand.nextFloat();
		System.out.println(num2 * 3);
		
		// Set num2 equal to a float value between 0 and 100
		num2 = rand.nextFloat();
		System.out.println(num2 * 100);
	}
}
