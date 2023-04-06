import java.util.Arrays;

public class GoodSubarrays {
    public static void main(String[] args) {
        int[] nums = {3,1,4,3,2,2,4};
        int k = 2;
        System.out.println(countGood(nums, k));
    }

    public static long countGood(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int[] newarr = Arrays.copyOfRange(nums, i, nums.length);
            if(check(newarr, k)){
                sum++;
            }
        }
        return sum;
    }

    public static boolean check(int[] nums, int k){
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count >= k;
    }
}
