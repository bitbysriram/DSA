import java.util.*;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k){

        // Map to store number -> frequency
        HashMap<Integer,Integer> map = new HashMap<>();

        // Count frequency of each number
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        // Store unique numbers
        List<Integer> list = new ArrayList<>(map.keySet());

        // Sort numbers by frequency (descending)
        list.sort((a,b) -> map.get(b) - map.get(a));

        int[] result = new int[k];

        // Store first k elements
        for(int i = 0; i < k; i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements of array:");

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Output: " + Arrays.toString(topKFrequent(nums, k)));
    }
}