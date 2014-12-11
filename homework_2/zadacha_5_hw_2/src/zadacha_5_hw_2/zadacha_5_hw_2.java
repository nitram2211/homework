package zadacha_5_hw_2;

import java.util.Scanner;

public class zadacha_5_hw_2 {

	public static void main(String[] args) {
		int number = 0;
		  int temp;
		  Scanner in = new Scanner(System.in);
		  int arr[]=new int[5];
		   for (int i = 0; i < 5; i++) {

		      System.out.print("Enter a number:");
		      number = in.nextInt();
		      
		      //int arr[] = new int[number];
		      
		     }
		   for(int c = 0; c<4;c++){
			   for(int d = 0;d<5;d++){
				 if(arr[d]>arr[d+1]){
					 temp       = arr[d];
			          arr[d]   = arr[d+1];
			          arr[d+1] = temp;
				 }
			   }
		   }
		  
		  }
		}