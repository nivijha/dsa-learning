

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        
        if(head==null){
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }


    //removeFirst
    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        if(size==1){
            head = tail = null;
            return;
        }

        head= head.next;
        head.prev = null;
        size--;
    }
    
    //removeLast
    public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }

        temp.next = null;
        size--;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + "<-->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll= new DoubleLL();

        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.addFirst(6);

        dll.print();

        dll.removeFirst();

        dll.print();
        
        dll.addLast(6);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        
        dll.print();
        
        dll.removeLast();
        
        dll.print();

        dll.reverse();

        dll.print();
    }
}
