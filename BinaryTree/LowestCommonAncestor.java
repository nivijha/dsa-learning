package BinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestor {
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

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root==null){
            return false;
        }

        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }

    public static int lcaFinder(Node root, int n1, int n2){ //O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last common ancestor
        int i= 0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //last equal node -> i-1th
        Node lca = path1.get(i-1);
        return lca.data;
    }

    public static Node lcaFinder2(Node root, int n1, int n2){ //O(n)
        if (root == null) {
            return root;
        }
        if(root.data == n1 || root.data == n2 ){
            return root;
        }

        Node leftLca = lcaFinder2(root.left, n1, n2);
        Node rightLca = lcaFinder2(root.right, n1, n2);

        if(rightLca == null){
            return leftLca;
        }

        if(leftLca == null){
            return rightLca;
        }
        if(rightLca != null && leftLca != null){
            return root;
        }

        return root;
    }

    public static int lcaDist(Node root, int n){ // O(n)
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        } else if(leftDist == -1){
            return rightDist+1;
        } else{
            return leftDist+1;
        }
    }

    public static int minDistBTWNodes(Node root, int n1, int n2){
        Node lca = lcaFinder2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1+dist2;
    }

    public static int kthAncestor(Node root, int n, int k){

        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = kthAncestor(root.left, n, k);
        int rightDist = kthAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist, rightDist);

        if(max+1 == k){
            System.out.println(root.data);
        }

        return max+1;
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

        System.out.println(lcaFinder(root1, 1, 3));
        System.out.println(lcaFinder2(root1, 4, 5).data);
        System.out.println(minDistBTWNodes(root1, 4, 6));

        kthAncestor(root1, 4, 1);
    }
}
