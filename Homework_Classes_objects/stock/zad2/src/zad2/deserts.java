package zad2;

public class deserts extends stock {

	private String type;
	private boolean sugar;

	public deserts() {
	}

	public deserts(String type, boolean sugar, int price, boolean available) {
		super.available = available;
		super.price = price;
		setType(type);
		setSugar(sugar);

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isSugar() {
		return sugar;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	@Override
	public void StockOut() {
		System.out.printf(
				"Type: %s , Price: %d$ , Available: %b , Sugar: %s .",
				this.type, super.price, super.available, this.sugar);
	}
}
