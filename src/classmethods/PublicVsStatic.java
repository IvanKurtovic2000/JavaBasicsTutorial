package classmethods;

public class PublicVsStatic {

	/*
	 * 
	 * n the examples above we used the static keyword for each method instead of
	 * public. A static method means that it belongs to the class, and cannot be
	 * accessed from outside of the class, unlike public. To access a method with an
	 * object, you must must declare the method as public:
	 * 
	 * 
	 */

	// Static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}

	// Public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

	public static void main(String[] args) {

		PublicVsStatic obj = new PublicVsStatic();
		obj.myPublicMethod();

		myStaticMethod();

	}

}
