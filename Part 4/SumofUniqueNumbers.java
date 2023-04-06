public class SumofUniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count(nums, nums[i]) == 1){
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int count(int[] nums, int target){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                count++;
            }
        }
        return count;
    }
}
