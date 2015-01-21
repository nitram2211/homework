package zad6;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Type a number:");
		int n = input.nextInt();
		if (n < 1 || n > 9) {
			System.out.println("Eror.");
		}
		if (n <= 3 && n >= 1) {
			n = n * 5;
			System.out.println("your score is:" + n);
		} else if (n <= 6 && n >= 4) {
			n = n * 10;
			System.out.println("your score is:" + n);

		}
		if (n <= 9 && n >= 7) {
			n = n * 50;
			System.out.println("your score is:" + n);
		}

	}

}
