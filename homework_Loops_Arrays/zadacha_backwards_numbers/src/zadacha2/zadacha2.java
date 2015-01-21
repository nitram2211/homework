package zadacha2;

public class zadacha2 {

	public static void main(String[] args) {
		int rows = 5;
		int cols = 6;
		int counter = 30;

		for (int n = 1; n <= rows; n++) {
				
			for(int j= 1; j <=cols; j++){
				System.out.printf(counter + " ");
				
				counter--;
			}
			System.out.println();
			
		}
	}

}
