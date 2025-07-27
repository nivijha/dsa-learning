package BinaryTree;

public class TransformSumTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }

    public static int sumTree(Node root){
        if(root == null){
            return 0;
        }

        int leftChlid= sumTree(root.left);
        int rightChild = sumTree(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft+ leftChlid + newRight + rightChild;

        return data;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
         *          1
         *        /  \
         *       2    3
         *      / \  / \
         *     4  5  6 7
         * 
         */

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        
        sumTree(root1);

        preorder(root1);
    }
}
