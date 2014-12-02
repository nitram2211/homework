package zad3;

import java.util.Scanner;

public class zad3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Name");
		String n = input.nextLine();

		System.out.println("Surname:");
		String sn = input.nextLine();

		System.out.println("Age");
		int a = input.nextInt();
		if (a < 0 && a > 120) {
			System.out.println("Невалидни години.");
		}

		System.out.println("Sex");
		char sex = input.next().charAt(0);
		if (sex != 'm' && sex != 'f') {
			System.out.println("Невалиден пол.");
		}
			System.out.println("ЕГН:");
			String e = input.next();

			System.out.println("Телефон:");
			String t = input.next();

			System.out.print(n + " " + sn + " " + "Години:" + a + " " + "Пол:"
					+ sex + " " + "Вашето ЕГН е:" + e + " "
					+ "Телефон за връзка:" + t);
		}

}
