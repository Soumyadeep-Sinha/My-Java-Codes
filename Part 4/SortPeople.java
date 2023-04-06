import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class SortPeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        int size = names.length;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(heights[i], names[i]);
        }
        String[] ans = new String[size];
        Arrays.sort(heights);
        for (int i = 0; i < size ; i++) {
            ans[i] = map.get(heights[size - i - 1]);
        }

        return ans;
    }
}
