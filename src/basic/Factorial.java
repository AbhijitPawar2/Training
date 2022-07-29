package basic;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to calculate its factorial : ");
		int number = in.nextInt();
		in.close();
		int ans = factorial(number);
		System.out.println(ans);

	}
	
	public static int factorial(int n) {
		int solution = 1;
		if(n == 0) {
			return 1;
		}
		else if (n > 0) {
				solution = n * factorial(n-1);
			}
		return solution;
	}

}
