package Strings;

import java.util.Arrays;

public class Anagrams {
    //SILENT LISTEN, NIGHT THING - same letters array but diffeent arrangements
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(Arrays.equals(a,b)){
            System.out.println("Anagarams");
        }else{
            System.out.println("not anagrams");
        }
    }
}
