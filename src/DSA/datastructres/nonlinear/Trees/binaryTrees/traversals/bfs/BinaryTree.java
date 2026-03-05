package DSA.datastructres.nonlinear.Trees.binaryTrees.traversals.bfs;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class BinaryTree {
     public static void levelOrderTraversalOnBfs(TreeNode root){
         //base case // corner case // edge case
         if(root==null){
             return;
         }
         //you are pusing nodes into the queue not integers
         Queue<TreeNode> queue=new LinkedList<>();
         //Add the root node into the queue and the traverse left and right
         queue.add(root);
         //print all nodes level by level till the queue  is empty
         while (!queue.isEmpty()){
             TreeNode temp=queue.poll();//remove and store the front node
             System.out.print(temp.data+ " ");
             //left subtree
             if (temp.left!=null){
                 queue.add(temp.left);
             }
             //right subtree
             if (temp.right!=null){
                 queue.add(temp.right);
             }
         }
         System.out.println();
     }
     public static void main(String[] args) {
         //level 0
         TreeNode root=new TreeNode(1);
         //level 1
         root.left=new TreeNode(2);
         root.right=new TreeNode(3);
         //level 2
         root.left.left=new TreeNode(4);
         root.left.right=new TreeNode(5);
         root.right.left=new TreeNode(6);
         root.right.right=new TreeNode(7);
         //level 3
         root.left.right.left=new TreeNode(8);
         root.right.right.left=new  TreeNode(9);
         System.out.println("BFS or level order traversal:");
         levelOrderTraversalOnBfs(root);
     }
}