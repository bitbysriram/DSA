import java.util.*;

public class MaxSubArraySum {

    // Function to find the maximum sum of a contiguous subarray
    public static int maxSubArray(int[] nums) {

        // Initialize currentSum and maxSum with first element
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Traverse array starting from second element
        for(int i = 1; i < nums.length; i++){

            // Decide whether to start a new subarray
            // or extend the previous subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maximum sum if current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum subarray sum
        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements in array:");

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);

        System.out.println("Max Sub Array Sum is: " + result);
    }
}