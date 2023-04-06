import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        selectionSort(arr, arr.size(), 0,0);
        System.out.println(arr);
    }
    public static void selectionSort(ArrayList<Integer> arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr.get(c) > arr.get(max)){
                selectionSort(arr,r,c+1, c);
            }
            selectionSort(arr,r,c+1, max);
        }
        swap(arr,max,r-1);
        selectionSort(arr,r-1,0,0);
    }

    public static void swap(ArrayList<Integer> arr, int a, int b){
        int temp = arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b,temp);
    }
}
