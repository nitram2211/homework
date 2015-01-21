import java.util.Scanner;


public class Finding_Sent_By_Word {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter word:");
		String word = input.nextLine();
		
		System.out.println("Enter a sentences:");
		String sent = input.nextLine();
		input.close();
		
		String[] parts = sent.split("\\.");
		
		for(int i=0; i<parts.length;i++){
			int contains = parts[i].indexOf(word);
			if(contains>0){
				System.out.println("The sentences with this word are:"+parts[i]);
			}
			
		}
	}

}
