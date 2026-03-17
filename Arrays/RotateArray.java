import java.util.*;

public class RotateArray {

    public void rotate(int[] nums, int k){

        int n = nums.length;

        // handle k greater than n
        k = k % n;

        // reverse entire array
        reverse(nums, 0, n - 1);

        // reverse first k elements
        reverse(nums, 0, k - 1);

        // reverse remaining elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums ,int start, int end){

        while(start < end){

            // swap elements correctly
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of K :");
        int k = sc.nextInt();

        System.out.println("Enter the length of Array :");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements in Array :");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        RotateArray obj = new RotateArray();

        obj.rotate(nums, k);

        System.out.println("The output : " + Arrays.toString(nums));
    }
}
/* 
TERMINAL
Enter the value of K :
3
Enter the length of Array :
6
Enter elements in Array :
1
2
3
4
5
6
The output :[4, 5, 6, 1, 2, 3]
 */