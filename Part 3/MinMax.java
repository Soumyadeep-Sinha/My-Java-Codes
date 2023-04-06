import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
//        int[] ans = new int[arr.size()];
//        for(int i = 0 ; i < arr.size() ; i++){
//            ans[i] = arr.get(i);
//        }
//        Arrays.sort(ans);
        Collections.sort(arr);
        long min = 0;
        long max = 0;
        for (int i = 0; i < 4; i++) {
            min += arr.get(i);
        }
        for (int i = 1; i < 5; i++) {
            max += arr.get(i);
        }

        System.out.println(min + " " + max);

    }
}
