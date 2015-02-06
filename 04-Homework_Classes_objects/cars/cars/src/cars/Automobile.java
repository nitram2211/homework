package cars;

public class Automobile extends car {
	
	private int fuel;
	
	
	public Automobile(){
		this.fuel = 0;
	}
	public Automobile(int fuel,int price) {
		super.price=price;
		setFuel(fuel);
	}
	
	public int getFuel() {

		return fuel;
	}

	public void setFuel(int fuel) {
		
			this.fuel = fuel;
		
	}
	public void carFuel(){
		System.out.printf("The fuel exhaust is  : %d. \n Price: %d ", this.fuel,super.price);
		
	}
}
