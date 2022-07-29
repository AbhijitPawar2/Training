package basic;

public class CityLoops {

	public static void main(String[] args) {
		// Declare and define an array.
		String[] cities = {"New York", "San Francisco", "Miami", "Chicago"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// do loop : executes once and then checks for condition.
		System.out.println("do loop");
		int i = 0;
		do {
			System.out.println(cities[i]);
			i = i + 1;
		}while (i < 4);

		// Declare the array. ( explicitly define size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		System.out.println(states[2]);
		
		// while loop : checks condition first before entering the loop.
		System.out.println("while loop");
		int j = 0;
		while(j <= 4) {
			System.out.println(states[j]);
			j += 1;
		}
		
		// declare array.
		String[] countries;
		
		// Defining the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "India";
		System.out.println(countries[2]);
		
		// for loop : best structure for iterating through an array.
		System.out.println("for loop");
		for (int k = 0; k <= 2; k++) {
			System.out.println(countries[k]);
		}
	}

}
