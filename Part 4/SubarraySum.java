import java.util.ArrayList;
import java.util.Arrays;

public class SubarraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[i];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
