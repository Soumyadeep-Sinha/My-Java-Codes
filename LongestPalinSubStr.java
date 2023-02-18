import java.util.ArrayList;

public class LongestPalinSubStr {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        /*ArrayList<String> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                if(isPalindrome(s.substring(i,j))){
                    int length = s.substring(i, j).length();
                    if(length > max){
                        max = length;
                        ans.add(0, s.substring(i,j));
                    }
                }
            }
        }
        return ans.get(0);*/
        if(s.length() == 1){
            return s;
        }
        String ans = "";
        boolean flag = true;
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {
                flag = true;
                str += s.charAt(j);
                for (int k = 0 , l = str.length()-1; k <= l ; k++, l--) {
                    if(str.charAt(k) != str.charAt(l)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    if(str.length() >= max){
                        max = str.length();
                        ans = str;
                    }
                }
            }
        }
        return ans;

    }

    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while (start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
