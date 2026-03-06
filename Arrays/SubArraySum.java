import java.util.*;

class SubArraySum {
    public int subArraySum(int[] nums, long k) {
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
        long k = 6;

        System.out.println("Input: " + Arrays.toString(nums) + ", k = " + k);

        SubArraySum sol = new SubArraySum();
        int result = sol.subArraySum(nums, k);

        System.out.println("Output: " + result);
    }
}
