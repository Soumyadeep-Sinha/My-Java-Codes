import java.util.LinkedList;
import java.util.Queue;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        Queue<Character> store = new LinkedList<>();

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            while(j < t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    store.offer(t.charAt(j));
                    j++;
                    break;
                }
                j++;
            }
        }

        return store.size() == s.length();
    }
}
