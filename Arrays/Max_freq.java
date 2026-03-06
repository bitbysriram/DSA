import java.util.*;

public class Max_freq {
    static void frequency(int nums[], int n) {
        boolean visited[] = new boolean[n];

        int max_ele = 0, min_ele = 0;
        int max_count = 0, min_count = n; // set min_count to n initially

        for (int i = 0; i < n; i++) {
            if (visited[i]) 
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            // update max frequency element
            if (count > max_count) {
                max_ele = nums[i];
                max_count = count;
            }

            // update min frequency element
            if (count < min_count) {
                min_ele = nums[i];
                min_count = count;
            }
        }

        System.out.println("Highest frequency element : " + max_ele + " (appears " + max_count + " times)");
        System.out.println("Lowest frequency element : " + min_ele + " (appears " + min_count + " times)");
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 1, 4};
        int n = nums.length;
        System.out.println("Input: " + Arrays.toString(nums));
        frequency(nums, n);
    }
}
