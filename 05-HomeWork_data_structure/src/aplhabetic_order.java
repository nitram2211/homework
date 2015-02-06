import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;

public class aplhabetic_order {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String words = " ";
		
	
		System.out.println("Type some text to sort alphabetically: ");
		words = input.nextLine();
		input.close();
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(words.split(" ")));
	
			
			System.out.println("Unsorted words : + w");
					for(String ao : list)
		{
			System.out.println(ao);
		}
					Collections.sort(list);	
					HashMap<String,Integer> map = new HashMap<String,Integer>();
				    
					for(String ao : list)
					{
						if(map.get(ao)==null)
						{
							map.put(ao, 1);
						}
						
						else
						{	
							Integer tmp = map.get(ao);
							map.put(ao, tmp+1);	
				 		}
						
					}
					System.out.println("Sorted words(No repeating): ");
						Set<String> wordKeys = map.keySet();
							for (String word : wordKeys) 
					{
						int count = map.get(word);
						if(count>=1)
						{
						System.out.printf("%s \n",  word);
						}
			
					}		
				}		
					
	}

