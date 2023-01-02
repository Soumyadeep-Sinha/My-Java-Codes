import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LilyHW {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,5,3,1));
        System.out.println(lilysHomework(arr));

    }
    public static int lilysHomework(List<Integer> arr){
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int last = arr.size() - 1 - i;
            int maxindex = getmax(arr, 0, last);
            swap(arr, maxindex, last);
            count++;
        }
        return count;
    }

    public static int getmax(List<Integer> arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr.get(max) < arr.get(i)){
                max = i;
            }
        }
        return max;
    }

    public static void swap(List<Integer> arr, int a, int b){
        int temp = arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b,temp);
    }
}
