import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Socks {
    public static void main(String[] args) {
        int n = 7;
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        System.out.println(sockMerchant(n, arr));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int[] freq = new int[n];
        for (int i = 0; i <n; i++) {
            freq[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if(ar.get(i) == ar.get(j)){
                    count++;
                    freq[j] = 0;
                }
            }
            if(freq[i] != 0){
                freq[i] = count;
            }
        }
        int pair = 0;
        System.out.println(Arrays.toString(freq));
        for (int i = 0; i < n; i++) {
            pair = pair + (freq[i]/2);
        }
        return pair;
    }
}
