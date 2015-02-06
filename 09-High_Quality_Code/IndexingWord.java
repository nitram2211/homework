
import java.util.Scanner;


public class IndexingWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Word:");
		String word = scan.nextLine();
		scan.close();
		
		char[] chars = word.toCharArray();
		int numberOfChar=1;
		for (int i = 0; i < chars.length; i++) {
			System.out.printf("\nThe number of '%c' is %d. ",chars[i],numberOfChar);
			numberOfChar++;
		}

	}

}