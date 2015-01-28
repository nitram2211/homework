
public class BucketSort {
public static void main(String[] args) {
	
	
	
	  int maxN=765;
      int [] arr= {45,26,12,345,24,456,464,765,47,2}; 
      
      
      for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
      sort(arr,maxN);
      System.out.println();
      for (int i : arr) {
		System.out.print(i+" ");
	}
}



public static void sort(int[] arr, int maxN) {
    int [] arrSort=new int[maxN+1];

    for (int i=0; i<arrSort.length; i++) {
    	arrSort[i]=0;
    }

    for (int i=0; i<arr.length; i++) {
    	arrSort[arr[i]]++;
    }

    int outPos=0;
    for (int i=0; i<arrSort.length; i++) {
       for (int j=0; j<arrSort[i]; j++) {
          arr[outPos++]=i;
       }
    }
 }
}
