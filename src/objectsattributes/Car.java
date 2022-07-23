package objectsattributes;

public class Car {
	
	private String brand;
	private String color;
	private double price;
	private String patent;
	private Engine engine;
	
	public Car(String brand, String color, double price, String patent, Engine engine) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.patent = patent;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", patent=" + patent + ", engine="
				+ engine + "]";
	}
	
	
	


}
