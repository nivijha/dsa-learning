package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewTree {

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

    static class Info {
        Node node;
        int hd;
        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
        
    }

    public static void topViewTree(Node root){
        // Level Order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max= 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info currInfo = q.remove();
            if(currInfo == null){
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                if(!map.containsKey(currInfo.hd)){
                    map.put(currInfo.hd, currInfo.node);
                }

                if(currInfo.node.left != null){
                    q.add(new Info(currInfo.node.left, currInfo.hd-1));
                    min = Math.min(min, currInfo.hd-1);
                }

                if(currInfo.node.right != null){
                    q.add(new Info(currInfo.node.right, currInfo.hd+1));
                    max = Math.max(max, currInfo.hd+1);
                }
            }
        }

        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        /*
         *          1
         *        /  \
         *       2    3
         *      / \  / \
         *     4  5  6 7
         * 
        */

        topViewTree(root1);
    }
}
