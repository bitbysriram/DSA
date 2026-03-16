import java.util.*;
public class ContiniousSubArraySum {

    // Function to check if a subarray of length >= 2 exists
    // whose sum is a multiple of k
    public static boolean continiousSubArraySum(int[] nums ,int k) {

        // HashMap to store remainder -> index
        // remainder = prefixSum % k
        HashMap<Integer,Integer> map = new HashMap<>();

        // Initialize remainder 0 at index -1
        // This helps detect subarrays starting from index 0
        map.put(0,-1);

        // Variable to store running prefix sum
        int sum = 0;
        
        // Traverse the array
        for(int i = 0; i < nums.length; i++){

            // Update running sum
            sum += nums[i];
             
            // Compute remainder of prefix sum with k
            int reminder = sum % k;

            // If this remainder appeared before
            if (map.containsKey(reminder)) {

                // Check if the subarray length >= 2
                if(i - map.get(reminder) > 1){
                    return true;
                }
            }

            // If remainder appears for the first time
            // store its index
            else{
                map.put(reminder, i);
            }
        }

        // If no valid subarray found
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements in array :");

        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter value of k :");
        int k = sc.nextInt();

        boolean result = continiousSubArraySum(nums, k);

        System.out.println("Output :" + result);
    }
}