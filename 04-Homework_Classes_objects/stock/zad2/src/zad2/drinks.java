package zad2;

public class drinks extends stock {

	private String type;
	private boolean alcohol;

	public drinks() {
	}

	public drinks(String type, boolean alcohol, int price, boolean available) {

		super.available = available;
		super.price = price;
		setType(type);
		setAlcohol(alcohol);

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAlcohol() {
		return alcohol;
	}

	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public void StockOut() {
		System.out.printf(
				"Type: %s , Price: %d$ , Available: %b , Alcohol: %s .",
				this.type, super.price, super.available, this.alcohol);
	}

}
