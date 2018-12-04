package strings;

public class StringExampel {

	public static void main(java.lang.String[] args) {

		String txt = "AbCdEfGhIJkLMnOPQRSTUVWXYZ";
		int len = txt.length();
		System.out.println("The length of the txt string is: " + len);

		System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase()); // Outputs "hello world"

		String txt1 = "Please find where 'hallo' occurs!";
		System.out.println(txt1.indexOf("hallo")); // Outputs 19

		// Parsing String to Int
		// Integer.parseInt() oder Integer.parseInt()
		String x = "10";
		int y = 10;
		int z = Integer.parseInt(x);
		int result = z + y;
		System.out.println(result);

	}

}
