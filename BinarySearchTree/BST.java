package BinarySearchTree;

import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){  // O(H) -- H -> height of tree
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        } else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean search(Node root, int key){ // O(H) -- H -> height of tree
        if (root == null) {
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        } else{
            return search(root.right, key);
        }

    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{ // when root.data == val
            // case 1 - No child
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 - Single child
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            //case 3 - Two child
            Node IS = findInorderSuccessor(root.right); // found inorder successor
            root.data = IS.data; // replaced the root value with inorder successor
            root.right = delete(root.right, IS.data); // then deleted the node of inorder successor 
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while (root.left!=null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data > k2){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("Null");
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
        }

        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node mirrorBST(Node root){ // O(n)
        if(root == null){
            return null;
        }

        Node leftSubtree = mirrorBST(root.left);
        Node rightSubtree = mirrorBST(root.right);
        
        root.left = rightSubtree;
        root.right = leftSubtree;

        return root;
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
        int val[]= {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i =0; i<val.length; i++){
            root = insert(root, val[i]);
        }

        inorder(root);
        if(search(root, 4)){
            System.out.print("Key Found");
        } else{
            System.out.print("Key not found");
        }


        System.out.println();
        System.out.println();
        int val1[]= {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root1= null;
        for(int i =0; i<val1.length; i++){
            root1 = insert(root1, val1[i]);
        }
        inorder(root1);
        root1 = delete(root1, 10);
        System.out.println();
        inorder(root1);

        System.out.println();
        System.out.println();
        printInRange(root1, 5, 12);

        System.out.println();
        System.out.println();
        printRootToLeaf(root1, new ArrayList<Integer>());

        System.out.println();
        System.out.println();
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);

        if(isValidBST(root1, null, null)){
            System.out.print("Valid");
        } else{
            System.out.print("False");
        }

        System.out.println();
        System.out.println();
        Node root3 = new Node(8);
        root3.left = new Node(5);
        root3.right = new Node(10);
        root3.left.left = new Node(3);
        root3.left.right = new Node(6);
        root3.right.right = new Node(11);
        preorder(root3);
        mirrorBST(root3);
        System.out.println();
        preorder(root3);
    }
}
