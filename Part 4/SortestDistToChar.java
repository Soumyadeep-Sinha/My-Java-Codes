import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortestDistToChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(s,c)));
    }

    public static int[] shortestToChar(String s, char c) {
        List<Integer> index = store_index(s,c);
        int[] dist = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            dist[i] = mindist(i, index);
        }
        return dist;
    }

    public static List<Integer> store_index(String s, char c){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                list.add(i);
            }
        }
        return list;
    }

    public static int mindist(int i, List<Integer> arr){
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < arr.size(); j++) {
            min = Math.min(min, Math.abs(i-arr.get(j)));
        }
        return min;
    }
}
