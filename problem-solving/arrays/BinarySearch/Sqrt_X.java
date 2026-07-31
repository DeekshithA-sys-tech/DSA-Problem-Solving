

public class Sqrt_X {
    public static int mySqrt(int x) {
        int left = 0, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
    public static void main(String[] args) {
        int x = 25;
        System.out.println(mySqrt(x));
    }
}
