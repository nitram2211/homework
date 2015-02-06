import java.util.Scanner;

public class ReversingInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Input an integer to turn it Backwards:");
		String number = scan.nextLine();
		scan.close();
		
		char[] digits = number.toCharArray();
		for (int i = digits.length-1; i >=0 ; i--) {
			int num = Character.getNumericValue(digits[i]);
		    System.out.print(num);
		}
	}
}