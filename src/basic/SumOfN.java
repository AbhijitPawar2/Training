package basic;
import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n : ");
		int num = in.nextInt();
		in.close();
		int sum = addition(num);
		System.out.println("Sum of numbers from 1 to " + num + " is " + sum);

	}
	
	public static int addition(int number) {
		int total = 0;
		for( ; number >= 1; number--) {
			total = total + number;
		}
		return total;
	}

}
