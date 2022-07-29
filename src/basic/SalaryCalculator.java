package basic;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Let's create a variable to define our career.
		
		// Declare a  Variable
		String career;
		System.out.print("Program is Starting......\n");
		
		//Defined a variable
		career = "Software Developer";
		System.out.println("My career is : " + career);
		 
		// Declare and Defining a variable at once.
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		// Compute our annual salary
		// rate * hoursPerWeek * weeksPerYear
		double salary = rate * hoursPerWeek * weeksPerYear;
		
		// Displaying the output
		System.out.println("My salary as " + career + " at the rate of " + rate + " per hour is " + salary + " per year.");
	}
}
