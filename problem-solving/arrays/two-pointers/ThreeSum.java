public class ThreeSum {
    public static int[] solution(int[] arr,int target){ 
        int n=arr.length;  
        // brute force approach
        // for (int i = 0; i < n-2; i++) {
        //     int val1 = arr[i];
        //     for (int j = i+1; j < n-1; j++) {
        //         int val2 = val1+ arr[j];
        //         int sum = target-val2;
                
        //         for (int k = j+1; k < n; k++) {
        //             if(sum==arr[k]){
        //                 return new int[]{i,j,k};
        //             }
                    
        //         }
                
        //     }
            
        // }

        // optimal solution
        int i=0; // fixed pointer iterator
        
        for (i = 0; i < n-2; i++) {
            int left=1;
            int right= n-1;
            while(left<right){
            if(arr[i]+arr[left]+arr[right] == target){
                return new int[]{i,left,right};
            }
            if(arr[i]+arr[left]+arr[right]>target){
                right--;
            }else{
                left++;
            }
        }
            
        }

        return  new int[]{-1,-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 21;
        int[] indices = solution(arr, target);
        for(int i : indices){
            System.out.print(i+" ");
        }
    }
}
