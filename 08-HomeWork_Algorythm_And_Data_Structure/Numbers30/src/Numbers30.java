import java.util.Scanner;


public class Numbers30 {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	int[]numbers=new int[30];
	for (int i = 0; i < numbers.length; i++) {
		numbers[i]=sc.nextInt();
	}
	
	int count = 0;
	
	for (int i = 1; i < numbers.length-1; i++) {
	
	int first = numbers[i - 1];
		int second = numbers[i];
		int third=numbers[i+1];
	
	if (first == second && second==third) {
	count++;
}
	}
	
	System.out.println("Тройките еднакви числа са:  " + count);
}
}
