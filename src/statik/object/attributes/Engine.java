package statik.object.attributes;

public class Engine {
	
	private String number;
	private double hp;
	private String type;
	
	public Engine(String number, double hp, String type) {
		super();
		this.number = number;
		this.hp = hp;
		this.type = type;
	}


	public void setHp(double hp) {
		if(hp > 0) {
			this.hp = hp;	
		}
		
	}

	@Override
	public String toString() {
		return "Engine [number=" + number + ", hp=" + hp + ", type=" + type + "]";
	}
	
	
	
	

}

