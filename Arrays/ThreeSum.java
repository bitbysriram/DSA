import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> ThreeSum(int[] nums){

        List<List<Integer>> result = new ArrayList<>();

        // sort array to apply two pointer technique
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){

            // skip duplicate first elements
            if(i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){

                    // store valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // skip duplicate values
                    while(left < right && nums[left] == nums[left - 1])
                        left++;

                    while(left < right && nums[right] == nums[right + 1])
                        right--;
                }

                else if(sum < 0){
                    left++;
                }

                else{
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements in Array :");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements in Array :");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Output : " + ThreeSum(nums));
    }
}
/* 
TERMINAL
Enter no of elements in Array :
6
Enter elements in Array :
1
0
-1
-2
1
0   
Output : [[-2, 1, 1], [-1, 0, 1]]
 */