package zad5;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		String c = input.nextLine();
		String card = "10";
		
		if(card.length()== 1 || card.equals(card)){
			
		
		 switch(c){
		 case "2":
		 case "3":
		 case "4":
		 case "5":
		 case "6":
		 case "7":
		 case "8":
		 case "9":
		 case "10":
		 case "J":
		 case "j":
		 case "Q":
		 case "q":
		 case "k":
		 case "K":
		 case "A":
		 case "a":{
			 System.out.println("Картата е валидна.");
			 break;
			
		 }
		 }
		 }
		else {
			System.out.println("Невалидна карта.");
		}
		 }

}