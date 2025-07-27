package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {
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

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx] == -1){
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }
        
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelorder(Node root){ // O(n)
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                } else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    } 
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root){ // O(n)
            if(root == null){
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh, rh) +1;
        }

        public static int countNode(Node root){
            if(root == null){
                return 0;
            }
            int lc = countNode(root.left);
            int rc = countNode(root.right);

            return lc + rc + 1;
        }

        public static int sumNodes(Node root){ // O(n)
            if(root == null){
                return 0;
            }
            int ls = sumNodes(root.left);
            int rs = sumNodes(root.right);

            return ls + rs + root.data;
        }

        // Approach 1 - O(n^2)
        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int ld = diameter(root.left);
            int rd = diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(Math.max(lh, rh), lh+rh+1);
        }

        static class Info {
            int diam;
            int height;

            public Info(int d, int h){
                diam = d;
                height = h;
            }
            
        }

        public static Info diameter2(Node root){
            if(root == null){
                return new Info(0, 0);
            }
            Info lInfo = diameter2(root.left);
            Info rInfo = diameter2(root.right);

            int diam = Math.max(Math.max(lInfo.diam, rInfo.diam), lInfo.height + rInfo.height + 1);
            int height = Math.max(lInfo.height, rInfo.height);

            return new Info(diam, height);
        }

        public static boolean isIdentical(Node node, Node subtreeRoot){
            if(node == null && subtreeRoot == null){
                return true;
            } else if(node == null || subtreeRoot == null || node.data != subtreeRoot.data){
                return false;
            } 

            if(!isIdentical(node.left, subtreeRoot.left)){
                return false;
            }

            if(!isIdentical(node.right, subtreeRoot.right)){
                return false;
            }

            return true;
        }

        public static boolean subtree(Node root, Node subtreeRoot){
            if(root == null){
                return false;
            }
            if(root.data == subtreeRoot.data){
                if(isIdentical(root, subtreeRoot)){
                    return true;
                }
            }

            return subtree(root.left, subtreeRoot) || subtree(root.right, subtreeRoot);
        }
    }

    public static void main(String[] args) {
        int node[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        // System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);


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

        System.out.println("height of tree = "+BinaryTree.height(root1));
        System.out.println("Count Nodes of tree = "+BinaryTree.countNode(root1));
        System.out.println("Sum of Nodes of tree = "+BinaryTree.sumNodes(root1));
        System.out.println("Diameter of tree = " + BinaryTree.diameter(root1));

        BinaryTree.Info info = BinaryTree.diameter2(root1);
        System.out.println("Diameter = " + info.diam + "  Height = " + info.height);

        /*
         *       2    
         *      / \  
         *     4  5  
         * 
        */

        Node subtree = new Node(2);
        subtree.left = new Node(4);
        // subtree.right = new Node(5);

        System.out.println("Checking identical/unidentical = "+BinaryTree.subtree(root1, subtree));
    }
}
