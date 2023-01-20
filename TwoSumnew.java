import java.util.Arrays;

public class TwoSumnew {
    public static void main(String[] args) {
        int[] num = {-1, 0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(num, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;


        while(start<end){
            if(numbers[start] + numbers[end] > target){
                end--;
            }else if(numbers[start] + numbers[end] < target){
                start++;
            }else{
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{};
    }
}
