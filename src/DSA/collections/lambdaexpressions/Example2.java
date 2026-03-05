package DSA.collections.lambdaexpressions;


interface Add{
    int sum(int a,int b);
}
public class Example2 {
    public static void main(String[] args) {
        Add add=(a,b) -> a+b;
        int result=add.sum(17,18);
        System.out.println(result);
    }
}
