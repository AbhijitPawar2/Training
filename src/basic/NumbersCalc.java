package basic;

public class NumbersCalc {
	public static void main(String[] args) {
		System.out.println("Program is starting...");
		printName();
		addNumbers(10,20);
		int multiplication = multiplyNumbers(10,20);
		System.out.println("Multiplication is : " + multiplication);
	}
	
	static void printName() {
		System.out.println("My name is Abhijit Pawar.");
	}
	
	static void addNumbers(int num1, int num2) {
		// This method will add two numbers.
		int addition = num1 + num2;
		System.out.println("Addition is : " + addition);
	}
	
	static int multiplyNumbers(int num1, int num2) {
		int multi = num1 * num2;
		return multi;
	}
}
