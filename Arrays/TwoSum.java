import java.util.*;

public class TwoSum {

    // Function to find two indices whose values add up to target
    public static int[] twoSum(int[] nums, int target){

        // HashMap to store number -> index
        HashMap<Integer,Integer> map = new HashMap<>();

        // Loop through the array
        for(int i = 0; i < nums.length; i++){

            // Find the number needed to reach the target
            int complement = target - nums[i];

            // Check if that number already exists in the map
            if(map.containsKey(complement)){

                // If found, return the indices
                return new int[]{map.get(complement), i};
            }

            // Otherwise store the current number and its index
            map.put(nums[i], i);
        }

        // If no pair is found return an empty array
        return new int[]{};
    }

    public static void main(String[] args){

        // Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Read array elements
        System.out.println("Enter elements in array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        // Read target value
        System.out.println("Enter target:");
        int t = sc.nextInt();

        // Call the function
        int[] result = twoSum(nums, t);

        // Check if a valid pair was found
        if(result.length == 2){
            System.out.println("Indices: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}