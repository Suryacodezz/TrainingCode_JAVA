package DSA.datastructres.nonlinear.Trees.binaryTrees.problrms.height;


class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class HeightOfBinaryTree {
    static int findHegiht(Node root){
        //base case-  if the root is null tree is empt height is 0
        if (root==null){
            return 0;
        }
        int leftHeight=findHegiht(root.left);
        int rightHeight=findHegiht(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(4);
        System.out.println("height of 1st tree: "+findHegiht(root));
        Node r1=null;
        System.out.println("height of 2nd tree: "+findHegiht(r1));
    }
}
