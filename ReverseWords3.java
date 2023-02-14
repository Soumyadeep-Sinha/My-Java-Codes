import java.util.Collections;

public class ReverseWords3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseword(arr[i]);
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i] + " ";
        }
        return ans.substring(0, ans.length()-1);
    }

    public static String reverseword(String s){
        String val = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            val += s.charAt(i);
        }
        return val;
    }
}
