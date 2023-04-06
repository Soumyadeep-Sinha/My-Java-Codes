package deep;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctindex = nums[i] - 1;
            if(nums[i] != nums[correctindex]){
                swap(nums, i, correctindex);
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
