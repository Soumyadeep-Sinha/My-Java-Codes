import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        //brute force
        /*int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int ans = 1;
            for (int j = 0; j < nums.length; j++) {
                if(i != j){
                    ans *= nums[j];
                }
            }
            res[i] = ans;
        }
        return res;*/
        //way 2
        int[] res = new int[nums.length];
        int ans = 1;
        for (int i = 0; i < nums.length; i++) {
            ans *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = ans / nums[i];
        }

        return res;
    }
}
