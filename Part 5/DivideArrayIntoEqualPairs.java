import java.util.Arrays;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }

    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = start + 1;
        int count = 0;

        while(start < nums.length-1){
            if(nums[start] == nums[end]){
                count++;
            }
            start += 2;
            end = start+1;
        }
        return count == nums.length/2;
    }
}
