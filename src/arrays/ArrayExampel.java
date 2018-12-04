package arrays;

public class ArrayExampel {

	public static void main(String[] args) {

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars[1]);
		// Outputs BMW

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		// Outputs All with for loop
		
		
		for (String i : cars) {
			  System.out.println(i);
			}
		// Outputs All with for-each loop

	}

}
