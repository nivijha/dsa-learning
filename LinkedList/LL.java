package LinkedList;

public class LL {
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

    public void addIndex(int index, int data){
        if(index==0){
            addFirst(data);
            return;
        }

        Node newNode= new Node(data);
        size++;
        Node temp= head;
        int i=0;
        while(i<index-1){
            temp= temp.next;
            i++;
        }
        newNode.next= temp.next;
        temp.next= newNode;
    }

    public int removeFirst(){
        int val;
        if(size==0){
            System.out.println("Linked List empty");
        }
        else if(size==1){
            val= head.data;
            head=tail=null;
            return val;
        }
        val=head.data;
        head= head.next;
        size--;
        return val;
    }

    public int removeLast(){
        int val;
        if(size==0){
            System.out.println("Linked List empty");
        }
        else if(size==1){
            val= head.data;
            head=tail=null;
            return val;
        }
        Node newNode= head;
        for(int i=0; i<size-2; i++){
            newNode= newNode.next;
        }
        val=tail.data;
        newNode.next= null;
        tail= newNode;
        size--;
        return val;
    }

    public int itrSearch(int key){ // O(n)
        Node temp= head;
        int i= 0;

        while(temp!= null){
            if(temp.data==key){ //key found
                return i;
            }
            temp= temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public int helperSearch(Node head, int key){ // O(n)
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int indx= helperSearch(head.next, key);
        if(indx==-1){
            return -1;
        }
        return indx+1;
    }
    public int recSearch(int key){
        return helperSearch(head, key);
    }

    public void reverseLL(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        head= prev;
    }

    public void removeNthnode(int keyindx){ // O(n)
        // Nth node from end
        // last node n, so from start it will be (size-n)

        int sz=0;
        Node temp= head;
        while(temp!=null){
            temp= temp.next;
            sz++;
        }

        if(keyindx==sz){
            head= head.next;
            return;
        }

        // size-n kyuki jis node ko delete krna h usse ek peeche rukna h
        int i=1;
        int iToFind= sz-keyindx;
        Node prev= head;
        while(i<iToFind){
            prev= prev.next;
            i++;
        }
        prev.next= prev.next.next;
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

    public Node findMid(Node head){
        Node slow= head;
        Node fast= head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkpalindromeLL(){
        if(head==null || head.next==null){
            return true;
        }
        //step1= find mid
        Node midNode= findMid(head);

        //step2= reverse 2nd half
        Node prev= null;
        Node curNode= midNode;
        Node next;
        while(curNode!=null){
            next= curNode.next;
            curNode.next= prev;
            prev= curNode;
            curNode= next;
        }
        Node right= prev; //right half head
        Node left= head;

        //step3- check left half & right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left= left.next;
            right=right.next;
        }
        return true;
    }

    public boolean isCycle(){
        Node slow= head;
        Node fast= head;

        while(fast!=null && fast.next!= null){
            slow= slow.next;//+1
            fast= fast.next.next;//+2
            if(slow==fast){ //cycle detected
                return true;
            }
        }
        return false; 
    }
    
    public static void removeCycle(){
        //detect cycle
        Node slow= head;
        Node fast= head;
        boolean cycle= false;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(fast==slow){
                cycle= true;
                break;
            }
        }

        if(cycle==false){
            return;
        }

        //find meeting point
        slow=head;
        Node prev= null; //last node
        while (slow!=fast){
            prev= fast;
            slow= slow.next;
            fast= fast.next;
        }

        //remove cycle ->last.next= null
        prev.next= null;
    }

    public static void main(String[] args) {
        LL ll= new LL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(7);
        ll.addLast(9);
        ll.printLL();
        ll.addIndex(3, 12);
        ll.printLL();
        ll.addIndex(0, 12);
        ll.printLL();
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        ll.printLL();

        System.out.println(ll.recSearch(9));
        ll.reverseLL();
        ll.printLL();
    }
    

    
}


