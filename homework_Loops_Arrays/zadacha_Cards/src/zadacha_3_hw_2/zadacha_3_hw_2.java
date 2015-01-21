package zadacha_3_hw_2;

public class zadacha_3_hw_2 {

	public static void main(String[] args) {

		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King" };

		for (int i = 0; i <= 3; i++) {
			System.out.printf("%s\t", suits[i]);
		}
		
		for(int j = 0;j<=ranks.length;j++){
			System.out.println(" ");
			
			for(int n = 1;n<=suits.length;n++){
				System.out.printf("%s\t", ranks[j]);
			}
		}
	}

}
