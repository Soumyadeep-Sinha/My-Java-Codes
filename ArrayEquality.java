import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayEquality {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        System.out.println(equalizeArray(arr));

    }
    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int[] freq = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            freq[i] = -1;
        }
        for (int i = 0; i < arr.size(); i++) {
            int count = 1;
            for (int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)){
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
        for (int i = 0; i < arr.size(); i++) {
            if(freq[i] != -1){
                pair++;
            }
        }
        int max = freq[0];
        for (int i = 1; i < freq.length; i++) {
            if(freq[i] > max){
                max = freq[i];
            }
        }
        return arr.size() - max;

    }
}
