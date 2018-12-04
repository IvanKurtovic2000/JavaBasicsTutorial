package variables;

public class Variables {

	// Tutorial W3C School
	// https://www.w3schools.com/java/java_variables.asp

	public static void main(String[] args) {

		String text = "ABCDEFGHIJKLMN";
		int zahl1 = 200;
		int zahl2 = 200;
		float gleitkommazahl = 102.12f;
		boolean status = true;
		char buchstabe = 'G';

		int x = 5, y = 6, z = 50;

		String text1 = "Hallo ";
		String text2 = "das ist ein";
		String text3 = " kurzer text";

		String fulltext = text1 + text2 + text3;

		// einfache Ausgabe von Variablen
		System.out.println("Ausgabe der Variable text: " + text);
		System.out.println("Ausgabe der Variable zahl: " + zahl1);
		System.out.println("Ausgabe der Variable gleitkommazahl: " + gleitkommazahl);
		System.out.println("Ausgabe der Variable status: " + status);
		System.out.println("Ausgabe der Variable buchstabe: " + buchstabe);
		System.out.println("Ausgabe der Variable fulltext: " + fulltext);

		// Addition der Variablen X, Y und z
		System.out.println(x + y + z);

		// Ausgabe der Varibale Variable text in Kleinschrift
		System.out.println("Ausgabe der Variable text in Kleinschrift: " + text.toLowerCase());

		// Ausgabe der Anzahl der Buchstaben von der Variable text:
		System.out.println("Ausgabe der Anzahl der Buchstaben von der Variable text: " + text.length());

		// Ausgabe des Buchstaben an der 5 Stelle von der Variable text:
		System.out.println("Ausgabe des Buchstaben an der 5 Stelle von der Variable text: " + text.charAt(5));

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		String ausgabe = text.substring(1, 3);
		System.out.println("Ausgabe der Variable ausgabe: " + ausgabe);

	}

}
