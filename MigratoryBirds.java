import java.util.*;
public class MigratoryBirds {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,4,4,5,3));
        System.out.println(migratoryBirds(arr));
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        System.out.println(arr);
        int n = arr.size();
        int[] freq = new int[n];
        for (int i = 0; i <n; i++) {
            freq[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if(arr.get(i) == arr.get(j)){
                    count++;
                    freq[j] = 0;
                }
            }
            if(freq[i] != 0){
                freq[i] = count;
            }
        }

        System.out.println(Arrays.toString(freq));
        int max = freq[0];
        for (int i = 0; i < freq.length; i++) {
            for (int j = 1; j < freq.length; j++) {
                if(freq[j] > freq[i]){
                    max = freq[j];
                }
            }
        }
        int min = 0;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] == max){
                min = arr.get(i);
                break;
            }
        }

        return min;
    }
}
