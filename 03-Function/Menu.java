public class Menu {

	public static void main(String[] args) {
		String[][] otherMultiArray = new String[][] {
			new String[] { "Soup,", "Tomato,", "Mushroom Soup,", "Bob." },
			new String[] { "Chicken,", "Fish,", "Beef,", "Lamb,", "Kebapche,","Vegan." },
			new String[] { "Cheescake,", "Cake." }
		};

		for (int i = 0; i < otherMultiArray.length; i++) {
			if (i == 0) {
				System.out.println("Soups:");
			} else if (i == 1) {
				System.out.println("Main Course:");
			} else if (i == 2) {
				System.out.println("Desert:");
			}
			for (int j = 0; j < otherMultiArray[i].length; j++) {
				System.out.print(" " + otherMultiArray[i][j]);
			}
			System.out.println();
		}
	}
}