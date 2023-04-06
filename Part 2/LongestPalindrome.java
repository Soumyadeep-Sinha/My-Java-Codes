import java.util.HashSet;

public class LongestPalindrome {
    public static void main(String[] args) {

    }

    public static int longestPalindrome(String s) {
        //keep a hashset to store unique character
        HashSet<Character> store = new HashSet<>();
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            if(store.contains(s.charAt(i))){
                len += 2;
                store.remove(s.charAt(i));
            }else{
                store.add(s.charAt(i));
            }
        }

        if(store.size() > 0){
            return len + 1;
        }else {
            return len;
        }
    }
}
