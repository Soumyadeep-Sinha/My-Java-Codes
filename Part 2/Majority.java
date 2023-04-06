package deep;
import java.util.*;
public class Majority {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        quick(nums , 0, nums.length - 1);
//        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        int count = 1;
        // int i = 0;
        for(int i=0; i < n - 1; i++){
            if(nums[i] == nums[i+1]){
                count++;
            }
            else if(nums[i] != nums[i+1]){
                count = 1;
            }
            if(count > n/2){
                return nums[i];
            }
        }
//        System.out.println(count);
        return -1;
    }

//    public static void sort(int[] arr){
//        int temp = 0;
//        for(int i=0; i < arr.length; i++){
//            for(int j=1; j < (arr.length-i); j++){
//                if(arr[j-1] > arr[j]){
//                    temp = arr[j-1];
//                    arr[j-1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }

    public static int partition (int arr[], int start, int end)
    {
        int pivot = arr[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++; // increment index of smaller element
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = t;
        return (i + 1);
    }

    /* function to implement quick sort */
    public static void quick(int arr[], int start, int end){
        if (start < end)
        {
            int p = partition(arr, start, end);  //p is partitioning index
            quick(arr, start, p - 1);
            quick(arr, p + 1, end);
        }
    }
}
