class StockSpanner {

    Stack<Pair> st;
    int count;

    public StockSpanner() {
        st = new Stack<>();
        count = 0;

    }

    public int next(int price) {
        int span = 1;
        while (!st.isEmpty() && st.peek().p <= price) {
            st.pop();
        }

        if (st.isEmpty()) {
            span = count + 1;
        } else {
            span = count - st.peek().i;
        }

        st.push(new Pair(price, count));

        count++;

        return span;
    }
}

class Pair {
    int p, i;

    Pair(int p, int i) {
        this.p = p;
        this.i = i;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */