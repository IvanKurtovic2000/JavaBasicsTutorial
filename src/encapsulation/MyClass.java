package encapsulation;

public class MyClass {

	/*
	 * private variables can only be accessed within the same class (an outside
	 * class have no access to it). However, it is possible to access them if we
	 * provide public getter and setter methods.
	 */

	public static void main(String[] args) {
		Person myObj = new Person();
		myObj.setName("John"); // Set the value of the name variable to "John"
		System.out.println(myObj.getName());
	}

}
