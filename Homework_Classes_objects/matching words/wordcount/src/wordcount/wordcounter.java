package wordcount;
import java.util.Scanner;



    public class wordcounter {

        public static void main(String args[]){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter your sentence:");
            String s=input.nextLine();
            System.out.println("Size of the string is "+s.length());
            int res=count(s);
            System.out.println("Number of the words in the given String is :--->>"+"  "+s+" "+"is"+" :"+res);
        }


        private static int count(String s) {
            // TODO Auto-generated method stub
            int count=0;
            if(s.charAt(0)!=' '){
                count++;
            }
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)==' ')){
                    count++;
                }
            }
            return count;
        }


}