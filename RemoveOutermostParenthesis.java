import java.util.Stack;

public class RemoveOutermostParenthesis {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }

    public static String removeOuterParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                str.append(s.charAt(i));
                str.append(s.charAt(i+1));
            }
        }

        return str.toString();
    }
}
