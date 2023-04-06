import java.util.Arrays;

public class GCDofArray {
    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int GCD = 0;
        for (int i = 1; i <= max; i++) {
            if(min % i == 0 && max % i == 0){
                GCD = Math.max(GCD, i);
            }
        }
        return GCD;
    }
}
