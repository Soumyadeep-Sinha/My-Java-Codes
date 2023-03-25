import java.util.HashMap;
import java.util.Map;

public class CheckDistances {
    public static void main(String[] args) {
        String s = "abaccb";
        int[] distance = { 1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println(checkDistances(s, distance));
    }

    public static boolean checkDistances(String s, int[] distance) {
        for (int i = 0; i < s.length(); i++) {
            int charInd = s.charAt(i) - 'a';
            int dist = findNext(s, s.charAt(i), i + 1) - i - 1;
            if (dist >= 0) {
                if (distance[charInd] != dist) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findNext(String s, char c, int index) {
        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}