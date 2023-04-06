import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SinghleNumberII {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(count(nums, nums[i])){
                return nums[i];
            }
        }
        return -1;

        /*HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], count(nums, nums[i]));
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;*/
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
