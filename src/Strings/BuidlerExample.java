package Strings;

public class BuidlerExample {


        public void StringInsert () {
           StringBuilder builder = new StringBuilder("JA");
            System.out.println("new string:" + builder);
            builder.insert(1, "AV");
            System.out.println("new string:" + builder);
        }
        public void StringAppend () {
          StringBuilder builder = new StringBuilder("SCE");
            System.out.println("new string:" + builder);
            builder.append(" ise");
            System.out.println("new string:" + builder);
        }
        public void StringReverse () {
           StringBuilder builder = new StringBuilder("AVAJ");
            System.out.println("new string:" + builder);
            builder.reverse();
            System.out.println("new string:" + builder);
        }
        public static void main(String[] args) {
            new BuidlerExample().StringInsert();
            new BuidlerExample().StringAppend();
            new BuidlerExample().StringReverse();
        }
    }

