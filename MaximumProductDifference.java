import java.util.Arrays;

public class MaximumProductDifference {
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int w = nums[0], x = nums[1], y = nums[nums.length-1], z = nums[nums.length-2];
        return (y*z) - (w*x);
    }
}
