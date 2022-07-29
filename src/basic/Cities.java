package basic;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array.
		String[] cities = {"New York", "San Francisco", "Miami", "Chicago"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);

		// Declare the array. ( explicitly define size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		System.out.println(states[2]);
		
		// declare array.
		String[] countries;
		
		// Defining the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "India";
		System.out.println(countries[2]);
	}

}
