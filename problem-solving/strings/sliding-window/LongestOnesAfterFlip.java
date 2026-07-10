public class LongestOnesAfterFlip {
    public static int longestOnes(String s, int k) {
        int left = 0, maxLen = 0, zeros = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '0') zeros++;

            while (zeros > k) {
                if (s.charAt(left) == '0') zeros--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestOnes("110100110", 2)); // Output: 5
    }
}
