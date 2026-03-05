package garbagecollection;
 import java.lang.Object;
public class Test {
    @Deprecated
    @Override
    protected void finalize() throws Throwable{
        System.out.println("object destoryd");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t=null;
        for (int i=1;i<100;i++){
        System.gc();
    }
}
}
