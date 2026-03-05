package Strings;

public class Stringpool {
    public static void main() {
        String s1="java";
         String s2="java";
        System.out.println(s1==s2);
        String s3=new String("java");
        System.out.println(s1==s3);
        //or
        System.out.println(s1.equals(s2));

    }
}
