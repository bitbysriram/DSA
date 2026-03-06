public class isPalindrome {
    public static boolean isPalindrome(int n) {
        int rev_num = 0;
        int dub = n;
        
        while(n > 0) {
            int ld = n % 10;
            rev_num = (rev_num * 10) + ld;
            n = n / 10;
        }

        if(dub == rev_num) {
            System.out.println("The given number is palindrome");
            return true;
        } else {
            System.out.println("Not palindrome");
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 11211;
        System.out.println("Input: " + n);
        isPalindrome(n);
    }
}
