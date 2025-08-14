

public class deleteNthNode {
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
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // Step-1 Create new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }

        // Step-2 newNode next = head
        newNode.next= head;

        // Step-3 head= newNode
        head= newNode;
    }

    public void addLast(int data){
        // Step-1 Create new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }

        // Step-2 
        tail.next= newNode;
        tail= newNode;
    }

    public void removeNthnode(int keyindxfromlast){
        // calculate size
        int sz=0;
        Node temp= head;
        while(temp!=null){
            sz++;
            temp= temp.next;
        }

        if(keyindxfromlast==sz){
            head= head.next;
            return;
        }
        
        int i=1;
        int iToFind= sz-keyindxfromlast;
        Node prev= head;
        while(i<iToFind){
            prev= prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return;

    }

    public void printLL(){
        Node newNode=  head;
        if(newNode==null){
            System.out.println("No element in LL");
            return;
        }
        while(newNode!=null){
            System.out.print(newNode.data+ "->");
            newNode= newNode.next;  
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        deleteNthNode ll= new deleteNthNode();
        
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(7);
        ll.addLast(9);

        ll.removeNthnode(3);

        ll.printLL();
        ll.removeNthnode(1);
        ll.printLL();
    }
}
