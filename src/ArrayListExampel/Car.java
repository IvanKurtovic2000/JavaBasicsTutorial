package ArrayListExampel;

public class Car {

	private int year;
	private String brand;
	private String model;
	private String type;

	public Car() {

	}

	public Car(int year, String brand, String model, String type) {
		super();
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", brand=" + brand + ", model=" + model + ", type=" + type + "]";
	}
	
	

}
