import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class cards {
	
	public static void main(String[] args) {
		
		int[] deck = new int[52];
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		ArrayList<String> hand = new ArrayList<String>();
		
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		for( int i = 0; i < deck.length; i++) 
		{
			deck[i] = i;
		}
		
		for( int i = 0; i < deck.length; i++)
		{
		
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		
		System.out.println("Your 5 card draw is:");
		
		
		for( int i = 0; i < 5; i++) 
		{
			String card = (ranks[deck[i] % 13]+" of "+suits[deck[i] / 13]);
			
			System.out.println(card);
			 hand.add(ranks[deck[i] % 13]);
		}
		for(String h:hand)
		{
			if(map.get(h)==null)
			{
				map.put(h, 1);
			}
			else
			{	
				Integer tmp = map.get(h);
				map.put(h, tmp+1);
				
	 		}
			
			}
			System.out.println("This is your hand: "+map);
			System.out.println("\nYou hold:");
			
			
			Set<String> handKeys = map.keySet();
			for (String card : handKeys) 
		{
			int count = map.get(card);
			if(count==4)
			{
			System.out.printf("%s : %d -> Four of a kind.\n", card, count);
			break;
		
			}
			else if (count==3)
			{
			System.out.printf("%s : %d -> Set.\n", card, count);
			break;
			}
			
			while (count==2)
			{
			System.out.printf("%s : %d -> Pair.\n", card, count);
			break;
			}
			
			System.out.println("High card.");
		
		}		
	}
	
	
}      
