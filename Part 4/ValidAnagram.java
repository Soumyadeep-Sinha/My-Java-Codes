import java.util.ArrayList;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "ab";
        String t = "a";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        permutations("", s);
        if(str.contains(t)){
            return true;
        }
        return false;
    }

    public static ArrayList<String> str = new ArrayList<>();
    public static void permutations(String p, String up){
        if(up.isEmpty()){
            str.add(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            str.add(first);
            String second = p.substring(i, p.length());
            str.add(second);
            permutations(first + ch + second, up.substring(1));
        }
    }
}
