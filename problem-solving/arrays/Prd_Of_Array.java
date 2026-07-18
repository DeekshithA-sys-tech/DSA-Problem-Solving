
public class Prd_Of_Array {
    public static int[] ProductOfArrayExceptSelf(int[] arr) {
        // int n = arr.length;

        // int[] prodArray = new int[n];

        // for (int i = 0; i < n; i++) {
        //     int val = 1;
        //     for (int j = 0; j < n; j++) {
        //         if (i != j)
        //             val *= arr[j];
        //     }
        //     prodArray[i] = val;
        // }
        // return prodArray;
        int n = arr.length;
        int[] result = new int[n];

        // Step 1: prefix products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
            System.out.println(result[i]);
        }

        // Step 2: suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] nums = ProductOfArrayExceptSelf(arr);
        // for (int num : nums) {
        //     System.out.println(num);
        // }
    }
}
