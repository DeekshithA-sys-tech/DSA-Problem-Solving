import java.util.*;

public class FindAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) need[c - 'a']++;

        int left = 0, right = 0;
        while (right < s.length()) {
            window[s.charAt(right) - 'a']++;
            right++;

            if (right - left == p.length()) {
                if (Arrays.equals(need, window)) result.add(left);
                window[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc")); // [0, 6]
    }
}
