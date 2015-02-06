import java.util.Scanner;


public class DufferentSort {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		int[] array = new int[10];
		int[] selectionSortedArr = selectionSort(array);


		for (int i = 0; i < 10; i++) {

			System.out.println("Enter " + (i + 1) + " number: ");
			number = input.nextInt();
			array[i] = number;
		}

		selectionSort(array);
		System.out.print("SelectionSort: ");
		for (int s : selectionSortedArr) {
			System.out.print(s + " ");
		}
		System.out.println();
		 MergeSort ms = new MergeSort();
	        
	        ms.sort(array);
	        System.out.print("MergeSort");
	        for(int i:array){
	            System.out.print(i+" ");
	    
	        }
	
	}

	private static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}

			int smallest = array[index];
			array[index] = array[i];
			array[i] = smallest;
		}
		return array;

	}
}
