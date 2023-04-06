import java.util.ArrayList;
import java.util.Arrays;

public class DecompressEncoded {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    //Input: nums = [1,2,3,4]
    //Output: [2,4,4,4]
    //Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
    //The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
    //At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static int[] decompressRLElist(int[] nums) {
        for (int i = 0; i < nums.length; i += 2) {
            put(nums[i], nums[i+1]);
        }
        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        return ans;
    }

    public static void put(int freq, int val){
        for (int i = 0; i < freq; i++) {
            arr.add(val);
        }
    }
}
