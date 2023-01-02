import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5};
        int target = 6;
        int index = 0;
        linearsearchAll(arr,target,index);
        System.out.println(nums);
    }

    static int lsearch(int[] arr, int target, int index){
        if(arr[index] == target){
            return index;
        }
        if(arr[index] == arr.length){
            return -1;
        }
        return lsearch(arr,target,index+1);
    }

    static ArrayList<Integer> nums = new ArrayList<>();
    static void linearsearchAll(int[] arr, int target, int index){
        if(arr[index] == target){
            nums.add(index);
        }
        if(arr[index] == arr.length){
            return;
        }
        linearsearchAll(arr,target,index + 1);
    }

}
