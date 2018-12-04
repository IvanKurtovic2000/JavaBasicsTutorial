package forloop;

public class ForloopExampel {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i = i + 2) {
		    System.out.println(i);
		}
		
		
		
		//for each loop
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
