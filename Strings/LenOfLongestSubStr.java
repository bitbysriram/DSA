import java.util.HashSet;
import java.util.Scanner;

public class LenOfLongestSubStr {

    public static int LengthOfLongestSubString(String s){

        // HashSet to store characters in current window
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){

            char c = s.charAt(right);

            // shrink window if duplicate character found
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }

            // add current character to window
            set.add(c);

            // update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String s = sc.nextLine();

        int result = LengthOfLongestSubString(s);

        System.out.println("The length of longest Sub-string of " + s + " is : " + result);
    }
}