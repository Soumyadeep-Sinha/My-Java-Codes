import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];

        /*for (int i = 0; i < temperatures.length; i++) {
            ans[i] = find(temperatures, i+1, temperatures.length, i);
        }

        return ans;*/

        for (int i = temperatures.length - 1; i >= 0 ; i--) {
            while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i] ){
                st.pop();
            }
            if(!st.empty()){
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }

        return ans;
    }

    /*public static int find(int[] arr, int start, int end, int target){
        for (int i = start; i < end; i++) {
            if(arr[i] > arr[target]){
                return (i - target);
            }
        }
        return 0;
    }*/
}
