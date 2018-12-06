package classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a Instance of Car
		Car car1 = new Car();
		car1.setColor("silber");
		car1.setModel("C-Klasse");
		car1.setBrand("Mercedes");

		// Creating another Instance of Car
		Car car2 = new Car("gold", "Golf", "Volkswagen");
		

		System.out.println(car1.getColor() + "  " + car1.getModel() + "  " + car1.getBrand());
		System.out.println(car2.getColor() + "  " + car2.getModel() + "  " + car2.getBrand());
		
		

	}

}
