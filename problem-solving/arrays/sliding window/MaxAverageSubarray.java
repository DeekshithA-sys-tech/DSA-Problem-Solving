public class MaxAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if (n < k) throw new IllegalArgumentException("Array size must be >= k");

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println("Maximum average subarray of size " + k + " is: " + findMaxAverage(nums, k));
    }
}
