package DSA.datastructres.nonlinear.Trees.binaryTrees.traversals.dfs;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
    public static void preOrder(TreeNode root){ //DLR
        if (root != null) {
            System.out.print(root.data+ " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root){ //LRD
        if (root != null) {
            postOrder(root.left);
            System.out.print(root.data+ " ");
            postOrder(root.right);
        }
    }
    public static void inOrder(TreeNode root){ //LDR
        if (root != null) {
            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data+ " ");
        }
    }
    public static void main(String[] args) {
        // rule for constructing the binary tree
        //level by level
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
        root.right.right.left=new TreeNode(9);
        System.out.println("Preorder Traversal: ");
        preOrder(root);
        System.out.println();
        System.out.println("postorder traversal: ");
        postOrder(root);
        System.out.println();
        System.out.println("inorder traversl: ");
        inOrder(root);
    }
}
