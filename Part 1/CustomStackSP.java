public class CustomStackSP {
    static class CustomStack {
        private int[] data;
        public int ptr = -1;
        public int size = 0;

        public CustomStack(int maxSize) {
            this.data = new int[maxSize];
        }

        public boolean isEmpty(){
            return ptr == -1;
        }

        public boolean isFull(){
            return ptr == data.length-1;
        }

        public void push(int x) {
            if(!isFull()){
                ptr++;
                data[ptr] = x;
                size++;
                System.out.println(x + "pushed in the stack");
            }else{
                System.out.println("stack is full");
            }
        }

        public int pop() {
            if(isEmpty()){
                return -1;
            }
            int rem = data[ptr];
            ptr--;
            size--;
            return rem;
        }

        public void increment(int k, int val) {
            if(data.length > k){
                for (int i = 0; i < k  ; i++) {
                    data[i] += val;
                }
            }
            if(data.length <= k){
                for (int i = 0; i < data.length  ; i++) {
                    data[i] += val;
                }
            }
        }
    }

    public static void main(String[] args) {
        CustomStack stk = new CustomStack(3);
        stk.push(1);                          // stack becomes [1]
        stk.push(2);                          // stack becomes [1, 2]
        stk.pop();                            // return 2 --> Return top of the stack 2, stack becomes [1]
        stk.push(2);                          // stack becomes [1, 2]
        stk.push(3);                          // stack becomes [1, 2, 3]
        stk.push(4);                          // stack still [1, 2, 3], Do not add another elements as size is 4
        stk.increment(5, 100);                // stack becomes [101, 102, 103]
        stk.increment(2, 100);                // stack becomes [201, 202, 103]
        stk.pop();                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]
        stk.pop();                            // return 202 --> Return top of the stack 202, stack becomes [201]
        stk.pop();                            // return 201 --> Return top of the stack 201, stack becomes []
        stk.pop();
    }
}
