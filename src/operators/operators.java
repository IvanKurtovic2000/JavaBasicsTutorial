package operators;

public class operators {

	/*
	 * Java divides the operators into the following groups:
	 * 
	 * Arithmetic operators Assignment operators Comparison operators Logical
	 * operators Bitwise operators
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum1 = 100 + 50;
		int sum2 = sum1 + 250;
		int sum3 = sum2 + sum2;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

		int x = 5;
		int y = 3;
		System.out.println(x == y); // returns false because 5 is not equal to 3

		int z = 4;
		System.out.println(z > 3 && z < 4); // returns true because one of the conditions are true (5 is greater than 3,
											// but 5 is not less than 4)

	}

}
