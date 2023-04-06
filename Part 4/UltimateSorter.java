import java.util.Arrays;

public class UltimateSorter {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
//        bubbleSort(arr,arr.length-1, 0);
//        selectionSort(arr);
//        insertionSort(arr);
        quickSort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[c+1]){
                swap(arr, c, c+1);
            }
            bubbleSort(arr, r, c+1);
        }
        bubbleSort(arr, r-1, c);
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxindex = getmax(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second){
        int[] combine = new int[first.length + second.length];
        int i = 0; // for first
        int j = 0; // for second
        int k = 0; // for combine

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                combine[k] = first[i];
                i++;
            }else{
                combine[k] = second[j];
                j++;
            }
            k++;
        }
        // for the extra length elements

        while (i < first.length){
            combine[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            combine[k] = second[j];
            j++;
            k++;
        }
        return combine;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while(start <= end){
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
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }

    public static int getmax(int[] arr, int start, int end){
       int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
