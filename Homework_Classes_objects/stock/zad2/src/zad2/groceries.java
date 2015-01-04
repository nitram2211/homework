package zad2;

public class groceries extends stock {

	private String type;
	private String country;

	public groceries() {
	}

	public groceries(boolean available, int price, String type, String country) {
		super.available = available;
		super.price = price;
		;
		setType(type);
		setCountry(country);

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public void StockOut() {
		System.out.printf(
				"Type: %s , Price: %d$ , Available: %b , Country: %s .",
				this.type, super.price, super.available, this.country);
	}

}
