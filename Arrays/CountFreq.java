import java.util.*;

class CountFreq {
    public static void maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print frequency map
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4};
        System.out.println("Input :");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        maxFrequencyElements(nums);
    }
}
