public class ContainerWithMostWater {
// Brute force approach
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = j - i;
                int minHeight = Math.min(height[i], height[j]);
                int area = width * minHeight;
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

    // two pointer approach
    // // public static int maxArea(int[] height) {

    //     int left = 0;
    //     int right = height.length - 1;
    //     int maxArea = 0;

    //     while (left < right) {
    //         // Calculate area between left and right
    //         int width = right - left;
    //         int minHeight = Math.min(height[left], height[right]);
    //         int area = width * minHeight;

    //         // Update maxArea if needed
    //         maxArea = Math.max(maxArea, area);

    //         // Move the pointer with smaller height inward
    //         if (height[left] < height[right]) {
    //             left++;
    //         } else {
    //             right--;
    //         }
    //     }

    //     return maxArea;
    // }



    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max Area: " + maxArea(height));
    }
}
