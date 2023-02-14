import java.util.Collections;
import java.util.TreeMap;

public class SortSentence2app {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s){
        String[] arr = s.split(" ");
        TreeMap<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put((int)(arr[i].charAt(arr[i].length()-1)), arr[i].substring(0,arr[i].length()-1));
        }

        String ans = "";
        for(Integer key: map.keySet()){
            ans += map.get(key) + " ";
        }

        return ans.substring(0, ans.length()-1);
    }
}
