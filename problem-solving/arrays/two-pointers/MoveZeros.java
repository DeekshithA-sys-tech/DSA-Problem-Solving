public class MoveZeros {
//     brute force approach
public static void moveZeros(int[] arr) {
        int left = 0; // pointer for the next non-zero position

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                // Swap non-zero element to the left pointer
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }

            
          
    // two pointer approach
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr =  {1, 0, 2, 0, 3};

        printArray(arr);
        moveZeros(arr);
        printArray(arr);
    }
}
