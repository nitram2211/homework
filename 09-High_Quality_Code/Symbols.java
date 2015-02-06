public class Symbols {

	public static void main(String[] args) {

		String symbols = "ppmmmgcggggssssttttttssssaaaaabbbgg";
		char[] chars = symbols.toCharArray();
		int indexCount = 0;

		for (int i = 1; i < chars.length; i++) {
			if (i - 1 == 0) {
				System.out.print(chars[0]);
			}
			if (chars[i] == chars[i - 1]) {
				indexCount++;
			} else if (chars[i] != chars[i - 1]) {
				System.out.print(chars[i]);
			}
		}
		System.out.println("\n Amount of repetions is: " + indexCount);
	}
}