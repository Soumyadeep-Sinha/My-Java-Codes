import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumOfPairs {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }

    public static int[] numberOfPairs(int[] nums) {
        int[] ans = new int[2];
        ArrayList<Integer> store = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!store.contains(nums[i])){
                store.add(nums[i]);
            }
        }

        int pairs = 0;

        for (int i = 0; i < store.size(); i++) {
            pairs += (count(nums, store.get(i)) / 2);
        }
        int rem = nums.length - (pairs*2);

        ans[0] = pairs;
        ans[1] = rem;

        return ans;
    }

    public static int count(int[] nums, int target){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                count++;
            }
        }
        return count;
    }
}
