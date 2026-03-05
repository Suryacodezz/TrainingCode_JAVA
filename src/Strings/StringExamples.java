package Strings;

public class StringExamples {
    static void main(String[] args) {
        char[] letters={'A','N','U','P'};

        String name=new String(letters);
        System.out.println(name);

        String jumbled="harsha1is1from1ise1section";
        String[] words=jumbled.split("1");
        System.out.println(words[3]);

        for(Object o:words){
            System.out.println(o+" ");
        }
        System.out.println();
        String data="  SNPSU ISE    ";
        System.out.println(data.trim());
    }
}
