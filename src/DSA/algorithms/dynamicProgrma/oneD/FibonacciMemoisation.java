package DSA.algorithms.dynamicProgrma.oneD;

import java.util.Arrays;

public class FibonacciMemoisation {
    public static int fibo(int n,int[] dp){
        if (n<=1) return n;
        if (dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
    public static void main(String[] args) {
        int n=6;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("fibonacci of index 6: "+fibo(n,dp));
    }
}
