package methods;

public class MethodExampel {

	static void myMethod(String fname) {
		System.out.println(fname + " Refsnes");
	}

	static int myMethod1(int x) {
		return 5 + x;
	}

	static int myMethod2(int x, int y) {
		return x + y;
	}

	static void checkAge(int age) {

		// If age is less than 18, print "access denied"
		if (age > 18) {
			System.out.println("Access granted - You are old enough!");

			// If age is greater than 18, print "access granted"
		} else {
			System.out.println("Access denied - You are not old enough!");
		}

	}

	public static void main(String[] args) {
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");

		int result = myMethod1(100);
		System.out.println(result);

		System.out.println(myMethod1(10));
		System.out.println(myMethod2(10, 10));

		checkAge(20);
		checkAge(17);


	}

}
