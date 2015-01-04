package zad2;

public abstract class stock {

	protected int price;
	protected boolean available;

	public stock() {
	}

	public stock(int price, boolean available) {
		setPrice(price);
		setAvailable(available);
	}

	public static void main(String[] args) {
		stock[] stock = { new groceries(true, 2, "Pepper", "Bulgaria"),
				new fruits("Apple", "US", 1, true),
				new meat("Beef", 3, 10, true),
				new drinks("Vodka", true, 15, false),
				new deserts("Cake", true, 20, true) };
		stock[0].StockOut();
		stock[1].StockOut();
		stock[2].StockOut();
		stock[3].StockOut();
		stock[4].StockOut();

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public abstract void StockOut();

}