import java.util.Objects;
import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"1","C"};
        System.out.println(calPoints(ops));
    }
    public static int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < ops.length; i++) {
            if(Objects.equals(ops[i], "C") && !st.empty()){
                st.pop();
            }
            if (Objects.equals(ops[i], "D")) {
                int num = st.pop();
                st.push(num);
                st.push(num*2);
            }
            if(Objects.equals(ops[i], "+")){
                int num1 = st.pop();
                int num2 = st.pop();
                int sum = num1 + num2;
                st.push(num2);
                st.push(num1);
                st.push(sum);
            }
            else if(!Objects.equals(ops[i], "C") && !Objects.equals(ops[i], "D") && !Objects.equals(ops[i], "+")){
                st.push(Integer.parseInt(ops[i]));
            }
        }
        while(!st.empty()){
            ans += st.pop();
        }
        return ans;
    }
}
