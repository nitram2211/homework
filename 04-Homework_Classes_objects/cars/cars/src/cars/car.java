package cars;

import java.util.Arrays;
import java.util.Comparator;

public class car {
	protected int price;
	

	public car() {
		this.price = 0;
	
	}

	public car(int price) {

		setPrice(price);

	}
	
	public static void main(String[] args) {
		car[] cars ={
				new Automobile(3000,3),
				new Automobile(4000,4),
				new Automobile(5000,5),
				new Automobile(6000,6),
				new Automobile(7000,7),
				new SUV(8000,true),
				new SUV(9000,true),
				new SUV(10000,false),
				new SUV(11000,true),
				new SUV(12000,false),
				
				Sort(cars);
		};
	}


	public int getPrice() {

		return price;
	}

	public void setPrice(int price) {

		this.price = price;
	}

	private static void Sort(car[] cars){
		
}
}