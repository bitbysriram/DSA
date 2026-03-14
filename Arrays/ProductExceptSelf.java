import java.util.*;

public class ProductExceptSelf {

    public static int[] ProductExceptSelf(int[] nums){

        int n = nums.length;
        int prefix = 1;

        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            // store product of all elements before index i
            result[i] = prefix;

            // update prefix by multiplying current element
            prefix *= nums[i];
        }

        int suffix = 1;

        for(int i = n - 1; i >= 0; i--){
            // multiply with product of elements after index i
            result[i] *= suffix;

            // update suffix by multiplying current element
            suffix *= nums[i];
        }

        // result now contains product of all elements except itself
        //result[i] = prefix_product × suffix_product
        return result;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of elements in Array :");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements in arrays :");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int[] result = ProductExceptSelf(nums);

        System.out.println("Output : " + Arrays.toString(result));
    }
}
//TERMINAL
/*Enter the no. of elements in Array :
 4
Enter elements in arrays :
1
3
2
4
Output :[24, 8, 12, 6] */