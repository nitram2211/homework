package zadacha2;

import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Моля въведете число 1 :");
		int a = input.nextInt();
		
		System.out.println("Моля въведете число 2 :");
		int b= input.nextInt();
		
		System.out.println("Моля въведете число 3 :");
		int c = input.nextInt();
		
		if(a + b >c && a + c >b && b + c > a ){
			System.out.println("Триъгалника е валиден.");
		}
		else{
			System.out.println("Триъгалникиа е невалиден");
		}
	}

}
