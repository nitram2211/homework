import java.util.Scanner;


public class Word_Counter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word that you want to be counted");
		String word = input.nextLine();
		
		System.out.println("Enter a sentence");
		String sent = input.nextLine();
		int counter = 0;
		
		String[] parts = sent.split("\\W+");
		
		for (int i = 0; i < parts.length; i++) {
			if	(word.equals(parts[i])){
				counter++;
					}

			}
			System.out.println("The word was counted: "+counter +"times");

	}

}
