package iflese;

public class ifelse {

	public static void main(String[] args) {

		// n the example below, we test two values to find out if 20 is greater than 18.
		// If the condition is true, print some text:
		if (20 > 18) {
			System.out.println("20 is greater than 18");
		}

		int time = 20;
		if (time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}

		int zahl = 22;
		if (zahl < 10) {
			System.out.println("zahl ist größer wie 10");
		} else if (zahl < 20) {
			System.out.println("zahl ist größer wie 20");
		} else {
			System.out.println("zahl ist  größer wie 10 und kleiner wie 20");
		}

	}

}
