import java.util.*;
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
       int i = 0;
       for(int j = 1 ;j < nums.length ; j++){
        if(nums[j] != nums[i]){
            i++;
            nums[i] = nums[j];
        }
       }
       return i+1;
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);

        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();

        int[] nums = new int[n];
        
        System.out.println("Enter a sorted array :");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k=removeDuplicates(nums);
        System.out.println("No. of unique elements"+k);
        System.out.println("Sorted array :");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

    }
}