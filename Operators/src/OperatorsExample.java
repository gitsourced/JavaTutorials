public class OperatorsExample {

	public static void main(String[] args) {
	
		// Addition(+) Subtraction(-) Multiplication(*) Division(/)
		// Order of Operations: Parentheses Exponent Multiplication Division Addition Subtraction
		System.out.println(9*3-(1+1)*8/2);
		
		// Modulus (%)
		System.out.println(19%4);
		
		// Increment
		int num0 = 1;
		System.out.println(num0++);
		System.out.println(num0);
		
		int num1 = 1;
		System.out.println(++num1);
		System.out.println(num1);
		
		// Decrement
		int num2 = 1;
		System.out.println(num2--);
		System.out.println(num2);
		
		int num3 = 1;
		System.out.println(--num3);
		System.out.println(num3);
		
		// Operations on variables with type casting
		int num4 = 1;
		int num5 = 12;
		System.out.println(((float)num4 + num5) / 2);		
	}
}
