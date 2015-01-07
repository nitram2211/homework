package zad;

import java.util.Scanner;

public class symbols {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = 0;
		System.out.println("Enter a five symbol word : ");
		String word = in.nextLine();
		if (word.length() > 6) {
			System.out.println("Invalid word !");
		}
		char[] arr = word.toCharArray();
		char[] array = new char[5];

		System.out.println("Enter five random symbols : ");
		for (int j = 0; j < array.length; j++) {
			array[j] = in.next().charAt(0);

			in.close();
		}

		for (char c : arr) {
			System.out.print(c);
		}

		System.out.println();

		for (char c : array) {
			System.out.print(c);
		}

		print(arr, array, counter);
	}

	public static void print(char[] arr, char[] array, int counter) {
		for (int i = 0; i < array.length; i++) {
			counter++;

			if (array[0] == arr[i] || array[1] == arr[i] || array[2] == arr[i]
					|| array[3] == arr[i] || array[4] == arr[i]) {
				System.out.print(" The symbol matches ");
			}

			else {
				System.err.println("     a word cannot be created");
				break;
			}
			if (counter == 5) {
				System.out.println();
				System.out.println(" a word can be created ");
			}
		}
	}

}
