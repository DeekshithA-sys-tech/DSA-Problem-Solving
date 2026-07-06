public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // Converting to lowercase and removing non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";

        System.out.println(isPalindrome(test1)); 
        System.out.println(isPalindrome(test2)); 
    }
}
