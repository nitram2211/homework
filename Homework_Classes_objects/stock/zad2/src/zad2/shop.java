package zad2;

import java.util.ArrayList;

import java.util.Scanner;

public class shop {

	private String name;
	private String location;
	private ArrayList stock = new ArrayList();

	public shop() {
	}

	public ArrayList getStock() {
		return stock;
	}

	public shop(String name, String location) {

		setName(name);
		setLocation(location);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public static void main(String[] args) {
		shop market = new shop();
		market.setName("Kaufland");
		market.getStock().add(new groceries(true, 2, "Cucumber", "UK"));

		Scanner in = new Scanner(System.in);
		System.out.println("Stock: ");
		groceries vegetable = new groceries();
		String vegname = null;
		vegname = in.nextLine();
		vegetable.setType(vegname);

	}

}