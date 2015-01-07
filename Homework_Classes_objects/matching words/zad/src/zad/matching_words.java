package zad;

import java.util.Scanner;

public class matching_words {

	public static void main(String[] args) {

		String[] array = new String[20];
		Scanner in = new Scanner(System.in);
		int counter = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + counter + " word: ");
			String duma = in.next();
			array[i] = new String(duma);
			counter++;
			in.close();
		}

		for (int k = 0; k < 20; k++) {

			for (int j = 0; j < k; j++) {

				if (array[k].equals(array[j])) {

					System.out.print(" " + array[k]);

				}
			}
		}

	}

}
