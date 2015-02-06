import java.util.HashSet;
import java.util.Scanner;

public class TwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println("How many integers to be the data base:");
		int loopOneLength = scan.nextInt();
		System.out.println("Input this numbers of integers: ");
		for (int i = 0; i <loopOneLength ; i++) {
			int setNums=scan.nextInt();
			set.add(setNums);
		} 
		
		System.out.println("How many integers you want to search for in the DB:");
		int loopTwoLength = scan.nextInt();
		int countSameNums=0;
		System.out.println("Input this numbers of integers: ");
		for (int i = 0; i <loopTwoLength ; i++) {
			int setNumToCompare=scan.nextInt();
			if(set.contains(setNumToCompare)){
				countSameNums++;
//				System.out.println("Number "+setNumToCompare+" is a match.");
			}
		} 
			scan.close();
			System.out.println("The count of matching numbers is: "+countSameNums);
	}
	public void ArraySolutionMethod(int[]arrayOne,int[] arrayTwo){ 
//              Array solution is slower by Big-O
		int count = 0;
		for (int i = 0; i < arrayOne.length; i++) {
			for (int j = 0; j < arrayTwo.length; j++) {
				if(arrayOne[i]==arrayTwo[j]){
				count++;
				}
			}
		}
				System.out.println("The count of matching numbers is: "+count);
	}
}