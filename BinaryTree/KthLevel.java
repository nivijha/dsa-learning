package BinaryTree;
import java.util.*;

public class KthLevel {

    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kthLevel(Node root, int level, int k){ // O(n)
        if(root == null){
            return;
        }
        if(level == k){
            System.err.print(root.data+" ");
            return;
        }
        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
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

        kthLevel(root1, 1, 3);
    }
}
