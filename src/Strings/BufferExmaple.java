package Strings;

public class BufferExmaple {



        public void StringInsert () {
            StringBuffer buffer = new StringBuffer("JA");
            System.out.println("new string:" + buffer);
            buffer.insert(1, "AV");
            System.out.println("new string:" + buffer);
        }
        public void StringAppend () {
            StringBuffer buffer = new StringBuffer("SCE");
            System.out.println("new string:" + buffer);
            buffer.append(" ise");
            System.out.println("new string:" + buffer);
        }
        public void StringReverse () {
            StringBuffer buffer = new StringBuffer("AVAJ");
            System.out.println("new string:" + buffer);
            buffer.reverse();
            System.out.println("new string:" + buffer);
        }
    public static void main(String[] args) {
            new BufferExmaple().StringInsert();
            new BufferExmaple().StringAppend();
            new BufferExmaple().StringReverse();
    }
}