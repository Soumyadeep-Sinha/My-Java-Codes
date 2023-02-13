import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int sum = 0;
        int count = nums.length / 2;

        int i = nums.length-1;
        int j = nums.length-2;

        while(count != 0){
            sum += Math.min(nums[i], nums[j]);
            i = i-2;
            j = j-2;
            count--;
        }

        return sum;
    }
}
