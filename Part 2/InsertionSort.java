import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        System.out.println(runningTime(arr));
    }
    public static int runningTime(List<Integer> arr) {
        // Write your code here
        System.out.println(arr);
        int[] nums = new int[arr.size()];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(nums[j] < nums[j-1]){
                    swap(nums, j, j-1);
                    count++;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
