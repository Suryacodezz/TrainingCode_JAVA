package Strings;

public class MutableString {
    public static void main(String[]args) {
        String s="sce";
        s+=" ise";
        System.out.println("string:"+s);
        //thread safe
        StringBuffer buffer=new StringBuffer("sce");
        buffer.append(" ise");
        System.out.println(buffer);
        //not thread safe
        StringBuilder builder=new StringBuilder("sce");
        builder.append(" ise");
        System.out.println(builder);
    }
}
