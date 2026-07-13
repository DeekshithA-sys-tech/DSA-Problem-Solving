public class RangeSumQuery {
    private int[] prefix;

    public RangeSumQuery(int[] nums) {
        prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return prefix[j + 1] - prefix[i];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        RangeSumQuery rsq = new RangeSumQuery(nums);
        System.out.println(rsq.sumRange(1, 3)); 
    }
}
