package zadacha_1_hw_2;

import java.util.Scanner;

public class zadacha_1_hw_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		for(int i = a;i<=b;i++){
			if(i % 3 ==0){
				System.out.println(i);
			}
		}
	}

}
