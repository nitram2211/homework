package zad;

import java.util.Scanner;

public class DaysToSec {

	public static void main(String[] args) {

		int days;
		int seconds;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter days count :");
		days = in.nextInt();

		seconds = days * 86400;

		System.out.println("There are " + seconds + " seconds in " + days
				+ " days .");

	}

}
