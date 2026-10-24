class LRUCache {
    class Node {
        int k, val;
        Node prev, next;

        Node(int key, int value) {
            this.k = key;
            this.val = value;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();

        //Dummy head and tail
        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        remove(node);
        addFirst(node);
        return node.val;
    }

    public void addFirst(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            remove(node);
            addFirst(node);
            return;
        }
        Node node = new Node(key, value);
        map.put(key, node);
        addFirst(node);
        if(map.size() > capacity){
            Node lru = tail.prev;

            remove(lru);
            map.remove(lru.k);
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */