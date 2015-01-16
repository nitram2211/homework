import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class massive_sort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n;
		System.out.println("Type how many integers do you want to sort:");
		n = Integer.parseInt(scan.nextLine());
		
		
		System.out.println("Type those integers:");

		
		for(int i=0; i<n; i++)
		{
	         list.add(scan.nextInt());
	    }
	    scan.close();
		Collections.sort(list);
		for(int x=0; x<n; x++)
		{
			System.out.print(list.get(x)+" ");
		}
	}

}