package statik.object.attributes;


public class Car {
	
	private String brand;
	private String color;
	private double price;
	private String patent;
	private Engine engine;
	private static double discount;
	
	public Car(String brand, String color, double price, String patent, Engine engine) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.patent = patent;
		this.engine = engine;
		Car.discount = 10;
	}
	
	public double promocionalPrice() {
		return this.price - this.price * Car.discount / 100;
	}
	
	public static void anulateDiscount() {
		Car.discount = 0;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", patent=" + patent + ", engine="
				+ engine + "]";
	}
	
	
	


}

