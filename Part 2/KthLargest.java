import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] nums = {-1,-1};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] ans = remduplicates(nums);
        System.out.println(Arrays.toString(ans));
        if(k >= ans.length){
            return nums[nums.length-1];
        }
        return ans[ans.length - k+1];
    }

    public static int[] remduplicates(int[] arr){
        Arrays.sort(arr);
        int j = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        if(arr[j] != arr[arr.length-1])
            arr[j++] = arr[arr.length-1];

        return Arrays.copyOf(arr, j);
    }
}
