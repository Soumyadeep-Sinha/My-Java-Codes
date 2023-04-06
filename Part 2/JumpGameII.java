public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int count = 0;

        int jumper = 0;
        int j = 0;
        while(j < nums.length-1){
            if(jumper + nums[j] >= nums.length-1){
                return count + 1;
            }
            else{
                jumper += nums[j];
                count++;
            }
            j = jumper;
        }

        return count;
    }
}
