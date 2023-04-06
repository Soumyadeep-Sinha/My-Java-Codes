package deep;

public class MaxJumpLength {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,2,1,2,5,1,1};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
//        if(nums.length == 1){
//            return true;
//        }
//        int i = 0;
//        int j = 0;
//        while(i < nums.length && j < nums.length){
//            int temp = i;
//            i = temp + nums[j+1];
//            j++;
//            if(i == nums.length-1){
//                return true;
//            }
//        }
//        return false;
        int temp = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if(i > temp){
                return false;
            } else if (temp < i + nums[i]) {
                temp = i + nums[i];
            } else if(temp==nums.length-1) {
                return true;
            }
        }
        return true;
    }
}
