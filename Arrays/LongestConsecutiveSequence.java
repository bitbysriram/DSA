import java.util.*;

public class LongestConsecutiveSequence {

    public static int LongestConsecutiveSequence(int[] nums){

        HashSet<Integer> set = new HashSet<>();

        // store all elements for O(1) lookup
        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){

            // start sequence only if previous number does not exist
            if(!set.contains(num - 1)){

                int length = 1;
                int current = num;

                // extend the sequence forward
                while(set.contains(current + 1)){
                    current++;
                    length++;
                }

                // update longest sequence length
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements in Array :");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements in Array :");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("The length of Longest Consecutive Sequence : "
                + LongestConsecutiveSequence(nums));
    }
}
/* 
TERMINAL :
Enter no. of elements in Array :
5
Enter elements in Array :
2
100
1
3
8
The length of Longest Consecutive Sequence :3
 */