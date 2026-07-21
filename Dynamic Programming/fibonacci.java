
public class fibonacci {
    static int[] dp = new int[100];
    public static int fib(int n){
        if(n<=1){
        return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fib(n-1)+fib(n-2);

        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
    
