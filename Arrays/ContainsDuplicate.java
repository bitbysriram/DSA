import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){

        // HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Traverse the array
        for(int num : nums){

            // If element already exists → duplicate found
            if(set.contains(num)){
                return true;
            }

            // Otherwise add element to the set
            set.add(num);
        }

        // If loop finishes → no duplicates
        return false;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        boolean result = containsDuplicate(nums);

        System.out.println("Output : " + result);
    }
}