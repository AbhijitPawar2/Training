package basic;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		else {
			System.out.println("The book does not contain the word " + wordChoice);
		}
		
		String browser;
		browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Browser is Chrome.");
		}
		else {
			System.out.println("Browser is not Chrome.");
		}
		
		String browser1;
		browser1 = "Chrome";
		if (browser1.equals("Chrome")) {
			System.out.println("Browser is Chrome.");
		}
		else {
			System.out.println("Browser is not Chrome.");
		}
		
		String browser2;
		browser2 = "Chrome";
		if (browser2 == "Chrome") {
			System.out.println("Browser is Chrome.");
		}
		else {
			System.out.println("Browser is not Chrome.");
		}
		
		String firstName = "Abhijit";
		String lastName = "Pawar";
		String SSN = "84562114556";
		
		// Length of string.
		System.out.println("There are " + SSN.length() + " number of digits in SSN.");
		
		// print the initials plus last 4 digit of the ssn.
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.println(SSN.substring(7));
		
		
		

	}

}
