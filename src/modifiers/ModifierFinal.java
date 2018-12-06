package modifiers;

public class ModifierFinal {

	final int x = 10;
	final double PI = 3.14;

	public static void main(String[] args) {

		ModifierFinal obj = new ModifierFinal();
		//obj.x = 10; // will generate an error: cannot assign a value to a final variable

		System.out.println(obj.x);

	}

}
