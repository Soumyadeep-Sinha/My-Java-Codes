import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums =  {1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[nums.length-1] != nums[nums.length - 2]){
            return nums[nums.length-1];
        }
//        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
            i++;
        }
        return -1;
    }
}
