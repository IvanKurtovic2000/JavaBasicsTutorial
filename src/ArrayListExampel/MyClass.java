package ArrayListExampel;

import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {

		Car obj1 = new Car(2000, "Mercedes", "A-Klasse", "SUV");
		Car obj2 = new Car(2018, "Audi", "B-Klasse", "Limousine");
		Car obj3 = new Car(2010, "VW", "C-Klasse", "Kombi");
		Car obj4 = new Car(2008, "Opel", "D-Klasse", "LKW");
		Car obj5 = new Car(2007, "Ferrari", "E-Klasse", "Pickup");
		Car obj6 = new Car(2010, "Smart", "G-Klasse", "SUV");
		Car obj7 = new Car(2011, "Mercedes", "S-Klasse", "Limousine");

		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(obj1);
		cars.add(obj2);
		cars.add(obj3);
		cars.add(obj4);
		cars.add(obj5);
		cars.add(obj6);
		cars.add(obj7);

		// Size of the ArrayList
		System.out.println(cars.size());

		// Size of the ArrayList
		System.out.println(cars.remove(obj7));

		// Size of the ArrayList
		System.out.println(cars.size());

		// Output of all car Objects
		for (Car car : cars) {
			System.out.println(car);
		}

	}

}
