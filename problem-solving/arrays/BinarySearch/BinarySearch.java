public class BinarySearch {
    public static int searchIndex(int[] arr, int val){
        int l = 0;
        int n = arr.length;
        int r = n-1;
        while(l<=r){
            // if(arr[l]==val) return l+1;
            // if(arr[r]==val) return r+1;
            int mid = (l+r)/2;
            if(arr[mid] == val){
                return mid+1;
            }else if (arr[mid] > val) {
                r = mid-1;
            }else{
                l = mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,12};
        int val = 12;
        System.out.println(searchIndex(arr,val));
    }
    
}