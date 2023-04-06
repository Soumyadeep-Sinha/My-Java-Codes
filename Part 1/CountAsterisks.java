import java.util.Stack;

public class CountAsterisks {
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }

    public static int countAsterisks(String s) {
        Stack<Character> st = new Stack<>();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '|' && !flag){
                st.push(s.charAt(i));
                flag = true;
            }
            else if(s.charAt(i) == '|' && flag){
                st.push(s.charAt(i));
                emptyStack(st);
                st.pop();
                flag = false;
            }
            if(s.charAt(i) == '*'){
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }

    public static void emptyStack(Stack<Character> st){
        st.pop();
        while(st.peek() != '|'){
            st.pop();
        }
    }
}
