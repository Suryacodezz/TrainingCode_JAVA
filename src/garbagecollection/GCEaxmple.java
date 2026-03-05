package garbagecollection;

public class GCEaxmple {
    public static void main(String[] args) {
        String s1=new String("java");
        String s2=new String("python");
        s1=s2;
        System.gc() ;
        System.out.println(s1);
    }
}
