package oop;

public class BankAccount {
	
	// define variables.
	String accountNumber;
	String routinNumber;
	String name;
	String ssn;
	String accountType;
	
	// constructor definitions : unique methods.
	// 1. They are used to define / setup / initialize properties of an object.
	// 2. Constructors are IMPLICITLY called upon instantiation.
	// 3. The same name as the class itself.
	// 4. Constructors have no return type.
	BankAccount() {
		System.out.println("New account created.");
	}
	
	// Overloading : call same method name with different arguments.
	BankAccount(String accountType) {
		System.out.println("New " + accountType + " created.");
	}
	
	BankAccount(String accountType, double initialDeposit) {
		System.out.println("New " + accountType + " created.\n" + initialDeposit + " Amount Deposited on opening.");
	}

	
	// define methods.
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
}
