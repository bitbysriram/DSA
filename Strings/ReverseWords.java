import  java.util.*;
public class ReverseWords {
    public static String reverseWords(String S){
        String[] words = S.split(" ");
        String result = "";

        for(int i = words.length - 1;i >= 0;i++){
            result += words[i];
        }
        return result.trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the sentence :");
        String S=sc.nextLine();
        
        System.out.println("After reversing words :"+reverseWords(S));
    }

}
