package cars;

public class SUV extends car {

	private boolean offroad;

	public SUV(int price, boolean offroad) {
		super.price = price;
		this.offroad = false;
	}

	public boolean getOffroad() {
		return offroad;
	}

	public void setOffroad(boolean offroad) {
		this.offroad = offroad;
	}
public void SUVout(){
	if (offroad==true){
		System.out.printf("Offroad : \n Price :%d",this.offroad,super.price);
	}
	else{
		System.out.printf("Offroad not available ! \n Price : %d",super.price);
	}
}
}
