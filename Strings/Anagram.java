import java.util.*;

public class Anagram {

    // Function to check whether two strings are anagrams
    public static boolean isAnagram(String s, String t){

        // If lengths are different → cannot be anagrams
        if(s.length() != t.length()) return false;

        // Array to store frequency of each letter (a–z)
        int[] count = new int[26];

        // Loop through first string and increase frequency
        for(char c : s.toCharArray()){
            count[c - 'a']++;   // convert character to index
        }

        // Loop through second string and decrease frequency
        for(char c : t.toCharArray()){
            count[c - 'a']--;
        }

        // If any frequency is not 0 → strings are not anagrams
        for(int n : count){
            if(n != 0){
                return false;
            }
        }

        // If all counts are zero → strings are anagrams
        return true;
    }

    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the 1st String:");
        String s = sc.nextLine();

        
        System.out.println("Enter the 2nd String:");
        String t = sc.nextLine();

        
        boolean result = isAnagram(s, t);

        System.out.println("Output: " + result);
    }
}