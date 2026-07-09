import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                result[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 4, 3};
        int[] res = nextGreaterElements(nums);
        System.out.println(Arrays.toString(res)); // [4, 2, 4, -1, -1]
    }
}
