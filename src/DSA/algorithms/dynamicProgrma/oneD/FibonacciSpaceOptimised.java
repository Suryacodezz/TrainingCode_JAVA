package DSA.algorithms.dynamicProgrma.oneD;

public class FibonacciSpaceOptimised {
    public static int fib(int n){
        if (n<=1) return n;
        int p2=0,p1=1;
        for (int i=2;i<=n;i++){
            int curr=p2+p1;
            p2=p1;
            p1=curr;
        }
        return p1;

    }
    public static void main(String[] args) {
        int  n=7;
        System.out.println("fibonacci of index :7 "+fib(n));
    }
}
