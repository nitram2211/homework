import java.util.Scanner;

public class TwentyNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 20 integers to find which is"
				+ " the bigest sum of 3 serial numbers.");
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		
		int maxSum = Integer.MIN_VALUE;
		int maxStartIndex = -1;
		for (int i = 2; i < array.length; i++) {

			int currentSum = array[i] + array[i - 1] + array[i - 2];
			if (currentSum > maxSum) {
				maxSum = currentSum;
				maxStartIndex = i;
			}
		}
		System.out.println("The biggest sum is:" + maxSum);
		System.out.printf("\nThe 3 int's are: %d , %d and %d. ",
								array[maxStartIndex - 2],
								array[maxStartIndex - 1],
								array[maxStartIndex]);
	}
}