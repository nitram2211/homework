import java.util.Scanner;


public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 20 integers: ");
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		  System.out.println("Input number to see is there a sum of ints equal to it");
	      int K = scan.nextInt();
	      scan.close();
	      
	      Sum sumOfK = new Sum();
	      sumOfK.findTheSumOfK(array, K);
	}
	 public void findTheSumOfK(int[] array, int numK) {
	        int currSum = 0;
	        int start = 0;
	        for (int i = 0; i <= array.length; i++) {
	 
	            while (currSum > numK) {
	                currSum = currSum - array[start++];
	            }
	            if (currSum == numK) {
	                System.out.println(numK + " is found between indexes "
	                						   + start+ " and " + (i - 1));
	                System.out.print("And the Elements are : ");
	                for (int j = start; j <= i - 1; j++) {
	                    System.out.print(" " + array[j]);
	                }
	                return;
	            }
	            if (i < array.length){
	                currSum = currSum + array[i];
	            }
	        }
	        System.out.println("No subarray is found with sum equals to " + numK);
	    }
}