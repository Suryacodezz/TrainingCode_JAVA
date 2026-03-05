package DSA.datastructres.linear.linkedlist.problems;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class EvenOdd {
    static Node head;
    static void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    static void printEven(){
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                System.out.print(temp.data+" ");

            }
            temp=temp.next;
        }
        System.out.println();

    }
    static void printOdd(){
        Node temp=head;
        while(temp!=null){
            if(temp.data%2!=0){
                System.out.print(temp.data+" ");

            }
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n=sc.nextInt();
        System.out.println("Enter the"+n+"nodes of the list:");
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        System.out.println("even number");
        printEven();
        System.out.println("odd number");
        printOdd();


    }

}