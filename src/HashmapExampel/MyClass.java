package HashmapExampel;

import java.util.HashMap;

public class MyClass {

	public static void main(String[] args) {
		// Create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);

		// to access a value in the HashMap, use the get() method and refer to its key:
		System.out.println(capitalCities.get("England"));

	}

}
