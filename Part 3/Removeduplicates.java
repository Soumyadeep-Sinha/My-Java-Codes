package deep;

import java.util.ArrayList;

public class Removeduplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,9};
        System.out.println(removeDuplicates(arr));
    }
    public static int[] removeDuplicates(int[] nums) {
        int[] list = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    list[i] = nums[i];
                }else{
                    list[i] = nums[j];
                }
            }
        }
        return list;
    }
}
