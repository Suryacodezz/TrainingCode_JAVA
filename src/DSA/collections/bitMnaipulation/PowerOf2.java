package DSA.collections.bitMnaipulation;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         if((n&(n-1))==0){
             System.out.println(n+"power of 2");
         }else{
             System.out.println(n+"not power of 2");
         }
    }
}
