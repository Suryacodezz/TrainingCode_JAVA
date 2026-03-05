package exceptions;

public class Demo {
    public static void main(String[] args) {
        try{
            int balance=2000;
            int withdraw=3000;
            if(withdraw>balance){
                throw new ArithmeticException("insuffient balance");
            }
        }catch (ArithmeticException e){
            System.out.println("caught exception:"+e.getMessage());
        }
    }
}
