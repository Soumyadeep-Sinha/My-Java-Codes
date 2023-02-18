import java.util.Arrays;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }

    public static int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count(nums, nums[i])){
                ans[j] = nums[i];
                j++;
            }
        }
        return ans;
    }

    public static boolean count(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                count++;
            }
        }
        return count == 1;
    }
}
