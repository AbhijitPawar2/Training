package oop;

class person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(email + " is eating.");
	}
	
	void sleep() {
		System.out.println(phone + " is sleeping.");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		// Instantiating an object.
		person person1 = new person();
		
		//define some properties.
		person1.name = "Abhijit";
		person1.email = "abhijit@email.com";
		person1.phone = "91302012080";
		
		//Abstraction.
		person1.walk();
		person1.eat();
		person1.sleep();
		
		person person2 = new person();
		person2.name = "Sujit";
		
		person2.walk();
		/*// person - 1
		
		// Attributes, variables, adjectives, descriptors.
		String name1 = "Abhijit";
		String email1 = "abhijit@gmail.com";
		String phone1 = "9130201080";
		
		// What the person can do, actions, activity, behavior.
		System.out.println(name1 + " is learning.");
		//System.out.println(name1 + " is working.");
		work(name1);
		
		// what if we want to do this for another person?
		// person - 2
		
		// Attributes, variables, adjectives, descriptors.
		String name2 = "Sujit";
		String email2 = "sujit@gmail.com";
		String phone2 = "9116901080";
				
		// What the person can do, actions, activity, behavior.
		System.out.println(name2 + " is learning.");
		//System.out.println(name2 + " is working.");
		work(name2);
		
		// not a efficient way to add persons.
		// we can enhance the code by adding functions to minimize the code.
	}
	
	static void work(String name) {
		System.out.println(name + " is working.");
	}*/
	}
}
