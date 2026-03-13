import java.util.*;

public class MajorityElement {

    public static int MajorityElement(int[] nums){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){

            // increase frequency of current number
            map.put(num, map.getOrDefault(num, 0) + 1);

            // if frequency becomes greater than n/2, it is the majority element
            if(map.get(num) > nums.length / 2){
                return num;
            }
        }

        // fallback (problem usually guarantees majority exists)
        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the Array :");
        int n = sc.nextInt();

        System.out.println("Enter elements in Array :");

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("The Majority Element is : " + MajorityElement(nums));
    }
}