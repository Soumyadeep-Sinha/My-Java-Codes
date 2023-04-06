import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
//        if(nums.length == 1){
//            return nums[0];
//        }
//        if(nums.length == 2){
//            int max = nums[0];
//            if(nums[1] >= nums[0]){
//                max = nums[1];
//            }
//            return max;
//        }
//        ArrayList<Integer> money = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+2; j < nums.length; j++) {
//                int sum = nums[i];
//                for (int k = j; k < nums.length; k+=2) {
//                    sum = sum + nums[k];
//                    money.add(sum);
//                }
//            }
//        }
//        System.out.println(money);
//        Collections.sort(money);
//        return money.get(money.size() - 1);
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
          return nums[0];
        }
        int max = 0, sum = 0;
        for(int num : nums){
            int temp = max;
            max = Math.max(sum + num, max);
            sum = temp;
        }
        return max;
    }
}
