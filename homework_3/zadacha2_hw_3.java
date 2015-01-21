package zadacha1_hw_3;

import java.util.Scanner;

public class zadacha2_hw_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++){
			System.out.println("Please enter a number:");
			int x = input.nextInt();
			calculatingNumbers(x);
			
		}
		
	}
 public static int calculatingNumbers(int x){
	 if (x % 2 == 0){
			System.out.println("You entered an even number.");
		}else {
			System.out.println("you eneterd an odd number.");
		}
	 return x;
 }
}
