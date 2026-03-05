package exceptions;

public class E3 {
    static void checkAge(int age){
        if(age>=18){
            System.out.println("eligible-access granted");
        }else{
            throw new RuntimeException("Not eligible-access denied");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
