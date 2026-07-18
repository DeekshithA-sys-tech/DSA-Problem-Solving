
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            int maxCount = 0;
            int val = nums[i];
            if (!set.contains(val - 1)) {
                maxCount = 1;
                int cur = val;
                while (set.contains(cur + 1)) {
                    maxCount++;
                    cur++;
                }
                count = Math.max(count, maxCount);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2}; // Output: 4
        System.out.println(longestConsecutive(nums));
    }
}
