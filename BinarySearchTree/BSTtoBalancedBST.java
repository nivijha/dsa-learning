package BinarySearchTree;

import java.util.ArrayList;

public class BSTtoBalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
        
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print((root.data)+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root, ArrayList<Integer> inorderseq){
        if(root == null){
            return;
        }

        inorder(root.left, inorderseq);
        inorderseq.add(root.data);
        inorder(root.right, inorderseq);
    }

    public static Node createBST(ArrayList<Integer> inorderseq, int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st + end)/2;
        Node root = new Node(inorderseq.get(mid));
        root.left = createBST(inorderseq, st, mid-1);
        root.right = createBST(inorderseq, mid+1, end);

        return root;
    }

    public static Node balancedBST(Node root){ // O(N)
        //inorder seq - O(N)
        ArrayList<Integer> inorderseq = new ArrayList<>();
        inorder(root, inorderseq);
        //sorted inorder -> balanced BST - O(N)
        root = createBST(inorderseq, 0, inorderseq.size()-1);

        return root;
    }

    public static void main(String[] args) {
        Node root1 = new Node(8);
        root1.left = new Node(6);
        root1.left.left = new Node(5);
        root1.left.left.left = new Node(3);
        root1.right = new Node(10);
        root1.right.right = new Node(11);
        root1.right.right.right = new Node(12);

        root1 = balancedBST(root1);
        preorder(root1);
    }
}
