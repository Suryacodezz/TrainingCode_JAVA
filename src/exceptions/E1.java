package exceptions;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=10;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[9]);
        }catch (ArithmeticException e){
            System.out.println("cannot divivde by zero");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid array index");

        }catch (Exception e){
            System.out.println("something has happende");
        }finally{
            System.out.println("end of execution");
            System.out.println("turn of db");
            System.out.println("turn off internet");
        }

        System.out.println("the value of k:"+k);
    }
    static {
        System.out.println("start exceution");
        System.out.println("load db");
        System.out.println("load internet");
        System.out.println("load files");

    }
}
