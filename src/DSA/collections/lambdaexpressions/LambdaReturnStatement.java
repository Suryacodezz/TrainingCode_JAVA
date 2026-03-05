package DSA.collections.lambdaexpressions;


interface Calculator{
    int operate(int a,int b);
}
public class LambdaReturnStatement {

        public static void main(String[] args) {
            Calculator multiply =(a,b) -> {
                int result= a*b;
                return result;
            };
            System.out.println("multiplication:"+multiply.operate(10,20));
        }
    }


