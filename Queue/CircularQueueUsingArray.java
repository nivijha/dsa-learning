package Queue;

public class CircularQueueUsingArray {
     static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            size = n;
            arr = new int[n];
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void enqueue(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];

            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1)%size; 
            }
            return result;
        }

        public static void printQueue(){
            if(isEmpty()){
                System.out.println("Empty Queue");
            }
            System.out.println();
            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + "  ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.printQueue();
        System.out.println();
        System.out.println(q.dequeue());
        q.printQueue();
        q.enqueue(4);
        q.printQueue();
        System.out.println();
        System.out.println(q.dequeue());
        q.printQueue();
        q.enqueue(5);
        System.out.println();
        q.printQueue();
    }
}