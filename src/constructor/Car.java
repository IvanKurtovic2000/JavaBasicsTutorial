package constructor;

public class Car {
	  int modelYear;
	  String modelName;

	  //Constructor with parameters
	  public Car(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) {
	    Car myCar = new Car(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }
	}

	// Outputs 1969 Mustang