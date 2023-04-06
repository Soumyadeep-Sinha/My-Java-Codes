import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        rearrangeArray(nums);
    }

    public static ArrayList<Integer> rearrangeArray(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                arr.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(arr.get(j) > 0 && arr.get(j+1) > 0){
                    arr.add(j+1, nums[i]);
                    j++;
                }
            }
        }
        System.out.println(arr);
        return arr;
    }
}
