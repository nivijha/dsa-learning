package BinarySearchTree;

public class SortedArrayToBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
        
    }

    public static Node arrayToBST(int[] arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr[mid]);
        root.left = arrayToBST(arr, st, mid-1);
        root.right = arrayToBST(arr, mid+1, end);
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        int st = 0;
        int end = arr.length-1;
        Node root = arrayToBST(arr, st, end);
        inorder(root);
    }
}
