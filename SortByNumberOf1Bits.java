import java.util.Arrays;
import java.util.HashMap;

public class SortByNumberOf1Bits {
    public static void main(String[] args) {
        int[] arr = {2,3,1,3,2};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }

    public static int[] sortByBits(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[i] = count1(arr[i], arr);
        }
        for (int i = 0; i < arr.length; i++) {
            map.put(count[i], arr[i]);
        }
        int[] ans = new int[arr.length];
        Arrays.sort(count);

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(count[i]);
        }

        return ans;
    }

    public static int count1(int x, int[] num){
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] == x){
                count++;
            }
        }
        return count;
    }
}
