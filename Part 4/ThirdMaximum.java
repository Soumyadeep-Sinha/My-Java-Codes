import java.util.Arrays;

public class ThirdMaximum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1};
        System.out.println(thirdMax(nums));

    }

    public static int thirdMax(int[] nums) {
        bubblesort(nums);
        int firstmax = nums[nums.length-1];
        int secondmax = nums[0];
        int thirdmax = nums[0];
        if(nums.length <= 2){
            return firstmax;
        }
        for (int i = nums.length - 2; i >= 0; i--){
            if (nums[i] != firstmax) {
                secondmax = nums[i];
                break;
            }
        }

        for (int i = nums.length - 3; i >= 0; i--){
            if (nums[i] != secondmax) {
                thirdmax =nums[i];
                return thirdmax;
            }
        }

        return thirdmax;
    }

    public static void bubblesort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                }
            }
        }
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
