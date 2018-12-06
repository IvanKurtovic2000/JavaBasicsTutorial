package UserInput;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter username");
		System.out.println("Enter age");

		String userName = myObj.nextLine(); // Read user input
		int age = myObj.nextInt(); // Read user input
		System.out.println("Username is: " + userName); // Output user input
		System.out.println("Age is: " + age); // Output user input

	}

}
