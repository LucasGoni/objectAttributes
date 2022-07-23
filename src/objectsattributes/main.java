package objectsattributes;

public class main {

	public static void main(String[] args) {
		
		Engine e = new Engine("1111", 2.0, "petrol");
		
		Car c = new Car("Peugeot", "black", 20000, "ZZZ", e);
		
		System.out.println(c);
		System.out.println(e);
		
		e.setHp(2.3);
		System.out.println("");
		System.out.println(e);
		System.out.println(c);

// The engine itself and the car's engine change its properties in this case
// There is a problem when we have multiples objects pointing to the same object as an attribute
		

	}

}
