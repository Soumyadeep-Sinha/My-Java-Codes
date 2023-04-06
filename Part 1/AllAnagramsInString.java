import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagramsInString {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s,p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i <= s.length()-p.length(); i++) {
            int j = p.length() + i;
            String sub = s.substring(i,j);
            if(checkAnagram(sub,p)){
                index.add(i);
            }
        }
        return index;
    }

    public static boolean checkAnagram(String s, String x){
        if(s.length() != x.length()){
            return false;
        }
        char[] a1 = s.toCharArray();
        char[] a2 = x.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }
}
