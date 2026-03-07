import java.util.*;

public class MoveZeroes {

    public static void moveZeroes(int[] nums){

        int i = 0;

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }

        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);

        System.out.println("Array after moving zeroes:");

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}