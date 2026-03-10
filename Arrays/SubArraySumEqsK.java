import java.util.*;

public class SubArraySumEqsK {

    // Function to count number of subarrays whose sum = k
    public static int subarraySum(int[] nums, int k) {

        // HashMap to store prefixSum -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize with prefix sum 0 appearing once
        // This helps count subarrays that start from index 0
        map.put(0, 1);

        // Variable to store running sum of elements
        int currentSum = 0;

        // Variable to count valid subarrays
        int count = 0;

        // Traverse the array
        for (int num : nums) {

            // Update running prefix sum
            currentSum += num;

            // Check if there exists a previous prefix sum
            // such that (currentSum - previousSum = k)
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            // Store/update frequency of current prefix sum
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        // Return number of subarrays with sum k
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = subarraySum(nums, k);

        System.out.println("Number of subarrays with sum = " + k + " is: " + result);
    }
}