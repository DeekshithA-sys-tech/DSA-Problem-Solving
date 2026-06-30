public class ColorSort {
    // brute Force Approach

    // public static void sortColors(int[] nums) {

    //     int n = nums.length;

    //     for(int i = 0; i < n - 1; i++){

    //         for(int j = 0; j < n - i - 1; j++){

    //             if(nums[j] > nums[j + 1]){

    //                 int temp = nums[j];
    //                 nums[j] = nums[j + 1];
    //                 nums[j + 1] = temp;

    //             }

    //         }

    //     }
        
         
    // }

    // optimal solution
    public static void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for(int num : nums){

            if(num == 0)
                zero++;
            else if(num == 1)
                one++;
            else
                two++;
        }

        int index = 0;

        while(zero-- > 0)
            nums[index++] = 0;

        while(one-- > 0)
            nums[index++] = 1;

        while(two-- > 0)
            nums[index++] = 2;
    }
    public static void printArray(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        printArray(arr);
    }
}
