public class PalindromicSubstringCount {
    
    public static int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // Count odd length palindromes
            count += expandAroundCenter(s, i, i);
            // Count even length palindromes
            count += expandAroundCenter(s, i, i + 1);
        }

        return count;
    }

    public static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
    

    public static void main(String[] args) {
        String input = "aaa";
        System.out.println("Longest Palindromic Substring: " + countSubstrings(input));
    }
}
