package DSA.datastructres.linear.linkedlist.problems.middleOfLL;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class MidOfLinkedList{
    static int findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(3);
        head1.next.next.next=new Node(4);
        head1.next.next.next.next=new Node(5);
        System.out.println("middle node data:"+findMiddle(head1));
    }
}
