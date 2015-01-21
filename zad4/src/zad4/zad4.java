package zad4;

public class zad4 {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		
		System.out.println("Before swapping two variables a: " + a +" b: " + b);

		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping two variables a: " + a +" b: " + b);


	}

}
