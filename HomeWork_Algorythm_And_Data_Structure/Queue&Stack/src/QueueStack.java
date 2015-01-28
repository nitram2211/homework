import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class QueueStack {
public static void main(String[] args) {
	
	Stack<String> myStack = new Stack<String>();
	Queue<String> queue = new LinkedList<String>();
	
	String str="¿Ó¬·Ë¿˜∆‡ƒÏ";

	
	
	char[] cSTR=str.toCharArray();
	
	
	for (char c : cSTR) {
		String currentChar=Character.toString(c);
		
	
		
		if(currentChar.equals(currentChar.toUpperCase())){
			myStack.push(currentChar);
		}
		else if(currentChar.equals(currentChar.toLowerCase())){
			queue.add(currentChar);
		}
	}
	
	while (!queue.isEmpty()) {
	    System.out.print(queue.remove());
	}
	
	System.out.println();
	while(!myStack.isEmpty()){
		
		String current = myStack.pop();
		System.out.print(current);
	}
	
}
}

