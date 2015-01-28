import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Numbers10 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		int[] array = new int[10];
		int[] sortedArray = selectionSort(array);
		Stack<Integer> nechetni = new Stack<Integer>();	
		Queue<Integer> chetni=new LinkedList<Integer>();
		

	
		for (int i = 0; i < 10; i++) {

			System.out.println("Vuvedi " + (i + 1) + " chislo: ");
			number = input.nextInt();
			array[i] = number;
		}

		selectionSort(array);
		System.out.print("Sorted array is: ");
		for (int s : sortedArray) {
			System.out.print(s + ",");
		}

		input.close();


		
		for (int c : sortedArray) {
			if (c % 2 == 0) {
				chetni.add(c);
				
			} else if (c % 2 == 1) {
		nechetni.push(c);
					
				
			}
		}
		
		System.out.println();
		System.out.println("Chetni: ");
		while (!chetni.isEmpty()) {
		    System.out.print(chetni.remove()+" ");
		}
		System.out.println();
	System.out.println("Nechetni: ");
		while (!nechetni.isEmpty()) {
		    System.out.print(nechetni.pop()+" ");
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


