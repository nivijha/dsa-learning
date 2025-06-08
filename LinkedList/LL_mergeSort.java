package LinkedList;
import java.lang.classfile.components.ClassPrinter.LeafNode;
import java.util.LinkedList;

public class LL_mergeSort {

    public static class Node{
        int data;
        Node next;
        public Node(){
            this.next = null;
        }
        public Node(int data){
            this.data= data;
            this.next = null;
        } 
        
    }  

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!= null && fast.next!=null){
            fast= fast.next.next;
            slow= slow.next;
        }

        return slow;
    }

    public Node merge(Node LH, Node RH){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(LH != null && RH != null){
            if(LH.data>=RH.data){
                temp.next= RH;
                RH= RH.next;
                temp= temp.next;
            }
            else{
                temp.next= LH;
                LH= LH.next;
                temp= temp.next;
            }
        }
        while(LH != null){
            temp.next= LH;
            LH= LH.next;
            temp= temp.next;
        }
        while(RH != null){
            temp.next= RH;
            RH= RH.next;
            temp= temp.next;
        }

        return mergeLL.next;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //first mid
        Node mid= getMid(head);
        //left & right mergeSort
        Node righHead= mid.next;
        mid.next = null;
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(righHead);
        

        //merge
        return merge(newLeft, newRight);
    }

    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge - zigzag merge
        while (left!=null && right!=null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;            
        }        
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        System.out.println(ll);

        ll.print();
        ll.zigzag();
        ll.print();

    }
    
}
