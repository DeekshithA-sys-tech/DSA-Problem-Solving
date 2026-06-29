public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
        int n = arr.length;

        //brute force approach
        // for (int i = 0; i < n-1; i++) {
        //     int val = target-arr[i];
        //     for (int j = i+1; j < n; j++) {
        //         if(arr[j]==val){
        //             return new int[]{i,j};
        //         }
        //     }           
        // }

        // opttimal solution
        int left = 0;
        int right = n-1;
        while(left<right){
        if(arr[left]+arr[right]==target){
            return new int[]{left,right};
        }
        if(arr[left]+arr[right]>target){
            right--;
        }else{
            left++;
        }
    }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={1,3,6,9};
        int target = 120;
        int [] index = twoSum(arr, target);
        System.out.println(index[0]+" "+index[1]);
    }
}
