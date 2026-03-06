import java.util.*;
public class ArrangeWords {
     public static String arrangeWords(String text) {
        text = text.toLowerCase();
        String[] words = text.split(" ");

        Arrays.sort(words , (a , b) -> a.length()- b.length());
        String result = String.join(" ",words);

        return Character.toUpperCase(result.charAt(0)) + result.substring(1);  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the sentence :");
        String text=sc.nextLine();
        
        System.out.println("Rearranged sentence is :"+arrangeWords(text));

    }
    
}
