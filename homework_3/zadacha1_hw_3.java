package zadacha1_hw_3;

import java.util.Random;

public class zadacha1_hw_3 {

	public static void main(String[] args) {

		Random rand = new Random();
		for(int i = 0;i < 20; i++){
			int param1 = rand.nextInt();
			int param2 = rand.nextInt();
			int param3 = rand.nextInt();

			calculateParam(param1,param2,param3);
			printParam(param1, param2, param3);	
		}
	}
	public static int calculateParam(int param1, int param2, int param3){
		int calc = param1 * param2 * param3;
		return calc;
		
}
	public static void printParam(int param1, int param2, int param3){
		System.out.printf("param1 %d * param2 %d * param3 %d", param1, param2, param3);
		System.out.println();
	}
}
