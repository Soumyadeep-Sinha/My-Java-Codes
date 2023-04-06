import java.util.Arrays;

public class MinStack {
    protected int[] data;
    int ptr = -1;

    public MinStack() {
        int DEFAULT_SIZE = 30000;
        this.data = new int[DEFAULT_SIZE];
        Arrays.fill(data, Integer.MAX_VALUE);
    }

    public boolean isfull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public void push(int val) {
        if(!isfull()){
            ptr ++;
            data[ptr] = val;
        }
        System.out.println(val + "inserted in stack");
    }

    public void pop() {
        int removed = Integer.MIN_VALUE;
        if(!isEmpty()){
            removed = data[ptr];
            data[ptr] = Integer.MAX_VALUE;
            ptr --;
        }
        System.out.println(removed + "removed from stack");
        /*System.out.print(Arrays.toString(data));*/
    }

    public int top() {
        return data[ptr];
    }

    public int getMin() {
        /*int[] newarray = new int[data.length];
        for(int i = 0; i < data.length ; i++){
            newarray[i] = data[i];
        }
        /*Arrays.sort(newarray);
        System.out.println(Arrays.toString(newarray));
        int min = 0;
        return -1;*/
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < data.length ; i++){
            if(data[i] < min){
                min = data[i];
            }
        }

        System.out.println("we got minimum --> " + min);

        return min;
    }

    public static void main(String[] args) {
        MinStack mystack = new MinStack();
        mystack.push(2);
        mystack.push(0);
        mystack.push(3);
        mystack.push(0);

        mystack.getMin();
        mystack.pop();
        mystack.getMin();
        mystack.pop();
        mystack.getMin();
        mystack.pop();
        mystack.getMin();
    }
}
