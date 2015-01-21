package zadacha1_hw_3;

import java.util.Scanner;

public class zadacha3_hw_3 {

	public static void main(String[] args) {
		
		System.out.println("The range is from 1 to 999.");
		int start = 1;
		int end = 999;
		
		for (int i = start; i <= end; i++) {
			if (symmetricNumber(i)) {
				System.out.printf("%d ", i);
			}	
		}
	}
	
	public static Boolean symmetricNumber(int number){
		boolean isSymmetric = false;
		String input = Integer.toString(number);
			for (int i = 0; i < input.length() / 2; i++) {
				if (input.charAt(i) == input.charAt(input.length() -1- i)) {
					isSymmetric = true;
				}
				else {
					isSymmetric = false;
					break;
				}
			}
		return isSymmetric;
	}
}