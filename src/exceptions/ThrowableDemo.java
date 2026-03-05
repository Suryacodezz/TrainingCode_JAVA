package exceptions;

public class ThrowableDemo {
    static void test() throws Throwable {
        throw new Throwable("somthing went wrong");
    }
    public static void main(String[] args) {
        try{
            test();
        }catch (Throwable t){
            System.out.println("handle:"+t);
            System.out.println("handled:"+t.getMessage());
        }
    }
}


