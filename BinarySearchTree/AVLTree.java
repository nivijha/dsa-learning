package BinarySearchTree;

public class AVLTree {
    static class Node {
        int data, height;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            height = 1;
        }
        
    }

    public static Node root;

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        return root.height;
    }

    static int max(int a, int b){
        return (a>b) ? a:b;
    }

    public static int getBalance(Node root){
        if(root == null){
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        //Perform rotation
        y.left = x;
        x.right = T2;

        //update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public static Node rightRotate(Node y){
        Node x= y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)+1);
        x.height = max(height(x.left), height(x.right)+1);

        return x;
    }

    public static Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        }

        if(key < root.data){
            root.left = insert(root.left, key);
        } else if(key > root.data){
            root.right = insert(root.right, key);
        } else{
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int bf = getBalance (root);

        // Left Left Case
        if(bf > 1 && key < root.left.data){
            return rightRotate(root); 
        }

        //Right Right Case
        if(bf < -1 && key > root.right.data){
            return leftRotate(root); 
        }

        //Left Right case
        if(bf > 1 && key > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root); 
        }

        //Right Left case
        if(bf < -1 && key < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root); 
        }

        return root; //returned AVL
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
        root= insert(root, 10);
        root= insert(root, 20);
        root= insert(root, 30);
        root= insert(root, 40);
        root= insert(root, 50);
        root= insert(root, 25);


        /* AVL Tree
         *         30
         *        /  \
         *       20   40
         *      / \    \
         *     10 25   50
         * 
         */


         preorder(root);
    }
}