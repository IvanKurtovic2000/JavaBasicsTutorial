package classes;

public class Car {

	private String color = null;
	private String brand = null;
	private String model = null;

	public Car() {

	}

	public Car(String color, String brand, String model) {
		super();
		this.color = color;
		this.brand = brand;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
