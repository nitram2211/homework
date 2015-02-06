package zadacha_4_hw_2;

import java.util.Scanner;

public class zadacha_4_hw_2 {

	public static void main(String[] args) {
		int highest=0, lowest=0, num=0;
	    Scanner scan = new Scanner(System.in);


	    for(int i=0; i<5; i++){

	       System.out.print("Enter a number:");
	       num = scan.nextInt();
	    }

	       if (num > highest){

	        highest = num;
	       }

	       
	       System.out.println("Highest number is: " + highest);
	       

}
}
