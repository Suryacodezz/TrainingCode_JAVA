package DSA.datastructres.nonlinear.Trees;

public class GenericTree<X>{
    private final X data;
    private GenericTree<X> left;
    private GenericTree<X> right;
    public GenericTree(X data){
        this.data=data;
        this.left=this.right=null;
    }
    void preOrder(){
        System.out.print(this.data+" ");
        if (this.left!=null) this.left.preOrder();
        if (this.right!=null)this.right.preOrder();
    }
    void postOrder(){
        if (this.left!=null) this.left.postOrder();
        if (this.right!=null)this.right.postOrder();
        System.out.print(this.data+" ");
    }
    void inOrder(){
        if (this.left!=null) this.left.inOrder();
        System.out.print(this.data+" ");
        if (this.right!=null)this.right.inOrder();
    }
    public static void main(String[] args) {
        //tree of integers
        GenericTree<Integer> integerRoot=new GenericTree<>(1);
        integerRoot.left=new GenericTree<>(2);
        integerRoot.right=new GenericTree<>(3);
        System.out.println("preorder integer: ");
        integerRoot.preOrder();
        System.out.println();
        System.out.println("postorder integer: ");
        integerRoot.postOrder();
        System.out.println();
        System.out.println("inorder integr: ");
        integerRoot.inOrder();
        System.out.println();
        System.out.println();

        //tree of floats
        GenericTree<Float> Float =new GenericTree<>(1.5f);
        Float.left=new GenericTree<>(2.5f);
        Float.right=new GenericTree<>(3.5f);
        System.out.println("preorder float: ");
        Float.preOrder();
        System.out.println();
        System.out.println("postorder float: ");
        Float.postOrder();
        System.out.println();
        System.out.println("inorderfloat: ");
        Float.inOrder();
        System.out.println();
        System.out.println();

        //tree of bolean
        GenericTree<Boolean> bool =new GenericTree<>(true);
        bool.left=new GenericTree<>(false);
        bool.right=new GenericTree<>(true);
        System.out.println("preorder boolean: ");
        bool.preOrder();
        System.out.println();
        System.out.println("postorder boolean: ");
        bool.postOrder();
        System.out.println();
        System.out.println("inorder boolean ");
        bool.inOrder();
        System.out.println();
    }
}
