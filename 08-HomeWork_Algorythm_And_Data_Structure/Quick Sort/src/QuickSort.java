
public class QuickSort {
public static void main(String[] args) {
	
	
	  int [] arr= {45,26,12,345,24,456,464,765,47,2}; 
	  for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	  Quicksort(arr, 0, arr.length-1);
	  System.out.println();
	  for (int i : arr) {
		System.out.print(i+" ");
	}
      
	  
}


	 
	 
	   public static int part(int arr[], int a, int b) {
	      int pivot = arr[a];
	      while (a < b) {
	         while (arr[a] < pivot) a++;
	         while (arr[b] > pivot) b--;
	         int temp = arr[a];
		      arr[a] = arr[b];
		      arr[b] = temp;
	      }
	      return a;
	   }
	 
	   public static void Quicksort(int arr[], int a, int b) {
	      if (a >= b) return;
	      int pivotIndex = part(arr, a, b);
	      Quicksort(arr, a, pivotIndex);
	      Quicksort(arr, pivotIndex+1, b);
	   }
}
