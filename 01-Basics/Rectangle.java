import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Моля въведете а:");
		float a = input.nextFloat();
		
		System.out.println("Моля въведете б:");
		float b = input.nextFloat();

		float S = a * b;
		System.out.print("Лицето на правоъгалника е :");
		System.out.println(S);

	}

}
