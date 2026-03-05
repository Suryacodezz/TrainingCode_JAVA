package DSA.collections.bitMnaipulation;

import java.util.Scanner;

public class EvenOddBit {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if((n&1)==0){
            System.out.println(n+"ise even");
        }else {
            System.out.println(n+"is odd");
        }
    }
}
