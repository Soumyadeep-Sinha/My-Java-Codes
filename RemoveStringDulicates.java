import java.util.Collections;
import java.util.Stack;

public class RemoveStringDulicates {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(st.peek() != s.charAt(i)){
                st.push(s.charAt(i));
            }
            else{
                st.push(s.charAt(i));
                st.pop();
                st.pop();
            }
        }

        StringBuilder str = new StringBuilder();
        while (!st.empty()){
            str.append(st.pop());
        }
        str.reverse();

        return str.toString();
    }
}
