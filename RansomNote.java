import java.util.ArrayList;
import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aab","ba"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mapran = new HashMap<>();
        HashMap<Character, Integer> mapmag = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            if(!mapran.containsKey(ransomNote.charAt(i))){
                mapran.put(ransomNote.charAt(i), count(ransomNote, ransomNote.charAt(i)));
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            if(!mapmag.containsKey(magazine.charAt(i))){
                mapmag.put(magazine.charAt(i), count(magazine, magazine.charAt(i)));
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if(mapmag.get(ransomNote.charAt(i)) == null){
                return false;
            }
            if(mapran.get(ransomNote.charAt(i)) > mapmag.get(ransomNote.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static int count(String s, char x){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == x){
                count++;
            }
        }
        return count;
    }

}
