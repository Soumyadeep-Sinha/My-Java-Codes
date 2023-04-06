import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,5,3,3,2,1};
        quick(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        //pivot
        int mid = start +(end - start)/2;
        int pivot = arr[mid];
        while (start <= end){
            if(arr[start] < pivot){
                start++;
            }
            if(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        System.out.println(pivot);
        quick(arr, low, end);
        quick(arr, start, high);
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
