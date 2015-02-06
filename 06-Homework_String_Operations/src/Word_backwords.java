import java.util.Scanner;


public class Word_backwords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = input.nextLine();
		input.close();
		
		char[] arr = word.toCharArray();  
		
		  for (int i = word.length() - 1; i >= 0; i--) {
		   
		   System.out.println(arr[i]);

		}

	}

}