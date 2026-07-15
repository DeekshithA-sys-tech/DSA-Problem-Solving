import java.util.*;

public class SubarraySumDivisibleByK {
    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;
            int mod = ((sum % k) + k) % k; 
            count += map.getOrDefault(mod, 0);
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println(subarraysDivByK(nums, k)); 
    }
}
