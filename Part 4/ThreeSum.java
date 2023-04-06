import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < len - 2; i++) {
            int target = -1 * nums[i];
            int start = i+1;
            int end = len-1;

            while(start < end){
                int val = nums[start] + nums[end];
                if(val == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);

                    ans.add(list);
                    start++;
                    end--;
                }

                else if(val < target){
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
