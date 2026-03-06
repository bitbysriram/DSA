import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rough {

     public static int subArraySum(int[] nums, Long k) {
        int n = nums.length;
        Map<Long, Integer> presumMap = new HashMap<>();
        int maxLength = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i]; // accumulate the prefix sum

            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

            long remainder = sum - k;

            if (presumMap.containsKey(remainder)) {
                int len = i - presumMap.get(remainder);
                maxLength = Math.max(maxLength, len);
            }

            // Only store the first occurrence of this sum
            if (!presumMap.containsKey(sum)) {
                presumMap.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 6;

        System.out.println(Arrays.toString(nums));


        int result = subArraySum(nums, (long) k);
        System.out.println("Output: " + result);

       
    }
    
}
