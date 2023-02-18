import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int size = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) > size && !arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }

        return arr;
    }
}
