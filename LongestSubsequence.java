import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubsequence {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5}, queries = {1};
        System.out.println(Arrays.toString(answerQueries(nums,queries)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int sum = 0;
            int j = 0;
            while(sum <= queries[i] && j <= nums.length-1){
                sum += nums[j++];
                if(sum <= queries[i]){
                    count++;
                }else{
                    break;
                }
            }
            list.add(count);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
