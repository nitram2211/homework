import java.util.Scanner;


public class Sentence {
public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedi izrechenie: ");
		String sentence=sc.nextLine();
		
		String[] parts = sentence.split(" |,");
		
		
for (String string : parts) {
	System.out.print(string+" ");
}
System.out.println();
sort(parts);
}

public static void sort(String[]parts){
for(int j=0; j<parts.length;j++)
{
    for (int i=j+1 ; i<parts.length; i++)
    {
        if(parts[i].compareTo(parts[j])<0)
        {
            String temp= parts[j];
            parts[j]= parts[i]; 
            parts[i]=temp;
        }
		
	
    }
}

for (String string : parts) {
	System.out.print(string+" ");
}
}
		
	
}

