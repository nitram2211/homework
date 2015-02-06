import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class homework_ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = "";
		
		
		System.out.println("Input text and see the unique words:");

			text = scan.nextLine();
	        
			String[] words = text.split("\\s+");
	         
	    
	    scan.close();
	    
	    HashMap<String,Integer> map = new HashMap<String,Integer>();
	    
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
		Set<String> wordKeys = map.keySet();
			for (String word : wordKeys) 
		{
			int count = map.get(word);
			if(count==1)
			System.out.printf("%s -> %d пъти\n", word, count);
		}		
	}
	

}