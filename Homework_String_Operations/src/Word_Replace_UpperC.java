import java.util.Scanner;

public class Word_Replace_UpperC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = input.nextLine();
		System.out.println("Enter a sentence");
		String sentence = input.nextLine();
		input.close();

		String upperC = word.toUpperCase();
		String modified = sentence.replace(word, upperC);
		System.out.println(modified);
	}

}
