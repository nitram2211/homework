package celtof;

import java.util.*;

class CelsiusToFarenheit {
	public static void main(String[] args) {
		float temperature;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter temperatue in Celsius :");
		temperature = in.nextInt();
		in.close();

		temperature = (temperature * 2) + 30;

		System.out.println("Temperatue in Farenheit = " + temperature);
	}
}