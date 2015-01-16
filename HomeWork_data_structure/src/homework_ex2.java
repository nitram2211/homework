import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class homework_ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> words= new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println("Type 20 words:");
		for(int i=0; i<20; i++){
			words.add(input.nextLine());
		}
		input.close();
		for(String w:words)
		{
			if(map.get(w)==null)
			{
				map.put(w, 1);
			}
			else
			{	
				Integer tmp = map.get(w);
				map.put(w, tmp+1);
				
	 		}
			
			

		}
			System.out.println(map);
	}
	

}