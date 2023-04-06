import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> pro = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                product *= nums[j];
            }
            pro.add(product / nums[i]);
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = pro.get(i);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
