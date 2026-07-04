public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0; // reset when encountering a 0
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1,1,1,1, 0, 1, 1, 1};
        System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(nums));
    }
}
